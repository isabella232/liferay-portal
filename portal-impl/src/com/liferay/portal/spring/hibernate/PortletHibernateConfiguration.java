/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.spring.hibernate;

import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PropsKeys;
import com.liferay.portal.util.PropsUtil;

import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

/**
 * <a href="PortletHibernateConfiguration.java.html"><b><i>View Source</i></b>
 * </a>
 *
 * @author Brian Wing Shun Chan
 * @author Ganesh P.Ram
 *
 */
public class PortletHibernateConfiguration
	extends TransactionAwareConfiguration {

	protected Configuration newConfiguration() {
		Configuration configuration = new Configuration();

		try {
			ClassLoader classLoader =
				PortletClassLoaderUtil.getClassLoader();

			String[] hibernateConfigs = PropsUtil.getArray(
				PropsKeys.HIBERNATE_CONFIGS);

			String[] configs = new String[hibernateConfigs.length + 1];
			ArrayUtil.combine(hibernateConfigs, new String[]{
					"META-INF/portlet-hbm.xml"}, configs);

			for (int i = 0; i < configs.length; i++) {
				try {
					InputStream is = classLoader.getResourceAsStream(
						configs[i]);

					if (is != null) {
						configuration = configuration.addInputStream(is);

						is.close();
					}
				}
				catch (Exception e1) {
					if (_log.isWarnEnabled()) {
						_log.warn(e1);
					}
				}
			}

			configuration.setProperties(PropsUtil.getProperties());
		}
		catch (Exception e) {
			_log.error(e, e);
		}

		return configuration;
	}

	protected void postProcessConfiguration(Configuration configuration) {

		// Make sure that the Hibernate settings from PropsUtil are set. See the
		// buildSessionFactory implementation in the LocalSessionFactoryBean
		// class to understand how Spring automates a lot of configuration for
		// Hibernate.

		String connectionReleaseMode = PropsUtil.get(
			Environment.RELEASE_CONNECTIONS);

		if (Validator.isNotNull(connectionReleaseMode)) {
			configuration.setProperty(
				Environment.RELEASE_CONNECTIONS, connectionReleaseMode);
		}
	}

	private static Log _log =
		LogFactory.getLog(PortletHibernateConfiguration.class);

}