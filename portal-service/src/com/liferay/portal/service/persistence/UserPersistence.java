/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service.persistence;

import com.liferay.portal.model.User;

/**
 * <a href="UserPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       UserPersistenceImpl
 * @see       UserUtil
 * @generated
 */
public interface UserPersistence extends BasePersistence<User> {
	public void cacheResult(com.liferay.portal.model.User user);

	public void cacheResult(java.util.List<com.liferay.portal.model.User> users);

	public com.liferay.portal.model.User create(long userId);

	public com.liferay.portal.model.User remove(long userId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User updateImpl(
		com.liferay.portal.model.User user, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByPrimaryKey(long userId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User[] findByUuid_PrevAndNext(long userId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User[] findByCompanyId_PrevAndNext(
		long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByContactId(long contactId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByContactId(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByContactId(long contactId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByEmailAddress(
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByEmailAddress(
		java.lang.String emailAddress, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByEmailAddress(
		java.lang.String emailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByEmailAddress_First(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByEmailAddress_Last(
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User[] findByEmailAddress_PrevAndNext(
		long userId, java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByPortraitId(long portraitId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByPortraitId(long portraitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByPortraitId(long portraitId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_U(long companyId, long userId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_U(long companyId,
		long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_DU(long companyId,
		boolean defaultUser)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_DU(long companyId,
		boolean defaultUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_DU(long companyId,
		boolean defaultUser, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_SN(long companyId,
		java.lang.String screenName)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_SN(long companyId,
		java.lang.String screenName)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_SN(long companyId,
		java.lang.String screenName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_EA(long companyId,
		java.lang.String emailAddress)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_EA(long companyId,
		java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_EA(long companyId,
		java.lang.String emailAddress, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_O(long companyId,
		java.lang.String openId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_O(long companyId,
		java.lang.String openId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_O(long companyId,
		java.lang.String openId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByC_A(
		long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByC_A(
		long companyId, boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_A_First(long companyId,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_A_Last(long companyId,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User[] findByC_A_PrevAndNext(long userId,
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User findByC_FID(long companyId,
		long facebookId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_FID(long companyId,
		long facebookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.User fetchByC_FID(long companyId,
		long facebookId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.User> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByContactId(long contactId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByEmailAddress(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByPortraitId(long portraitId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_U(long companyId, long userId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_DU(long companyId, boolean defaultUser)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_SN(long companyId, java.lang.String screenName)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_EA(long companyId, java.lang.String emailAddress)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_O(long companyId, java.lang.String openId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeByC_FID(long companyId, long facebookId)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException;

	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByContactId(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByEmailAddress(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByPortraitId(long portraitId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_DU(long companyId, boolean defaultUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_SN(long companyId, java.lang.String screenName)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_EA(long companyId, java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_O(long companyId, java.lang.String openId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByC_FID(long companyId, long facebookId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Group> getGroups(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Group> getGroups(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Group> getGroups(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getGroupsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsGroup(long pk, long groupPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsGroups(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addGroup(long pk, long groupPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addGroup(long pk, com.liferay.portal.model.Group group)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addGroups(long pk, long[] groupPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addGroups(long pk,
		java.util.List<com.liferay.portal.model.Group> groups)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void clearGroups(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeGroup(long pk, long groupPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeGroup(long pk, com.liferay.portal.model.Group group)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeGroups(long pk, long[] groupPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeGroups(long pk,
		java.util.List<com.liferay.portal.model.Group> groups)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setGroups(long pk, long[] groupPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setGroups(long pk,
		java.util.List<com.liferay.portal.model.Group> groups)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Organization> getOrganizations(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getOrganizationsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsOrganization(long pk, long organizationPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsOrganizations(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addOrganization(long pk, long organizationPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addOrganization(long pk,
		com.liferay.portal.model.Organization organization)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addOrganizations(long pk, long[] organizationPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addOrganizations(long pk,
		java.util.List<com.liferay.portal.model.Organization> organizations)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void clearOrganizations(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeOrganization(long pk, long organizationPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeOrganization(long pk,
		com.liferay.portal.model.Organization organization)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeOrganizations(long pk, long[] organizationPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeOrganizations(long pk,
		java.util.List<com.liferay.portal.model.Organization> organizations)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setOrganizations(long pk, long[] organizationPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setOrganizations(long pk,
		java.util.List<com.liferay.portal.model.Organization> organizations)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Permission> getPermissions(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Permission> getPermissions(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Permission> getPermissions(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getPermissionsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsPermission(long pk, long permissionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsPermissions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addPermission(long pk, long permissionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addPermission(long pk,
		com.liferay.portal.model.Permission permission)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addPermissions(long pk, long[] permissionPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addPermissions(long pk,
		java.util.List<com.liferay.portal.model.Permission> permissions)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void clearPermissions(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removePermission(long pk, long permissionPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removePermission(long pk,
		com.liferay.portal.model.Permission permission)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removePermissions(long pk, long[] permissionPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removePermissions(long pk,
		java.util.List<com.liferay.portal.model.Permission> permissions)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setPermissions(long pk, long[] permissionPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setPermissions(long pk,
		java.util.List<com.liferay.portal.model.Permission> permissions)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Role> getRoles(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Role> getRoles(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Role> getRoles(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getRolesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsRole(long pk, long rolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsRoles(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addRole(long pk, long rolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addRole(long pk, com.liferay.portal.model.Role role)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addRoles(long pk, long[] rolePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addRoles(long pk,
		java.util.List<com.liferay.portal.model.Role> roles)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void clearRoles(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeRole(long pk, long rolePK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeRole(long pk, com.liferay.portal.model.Role role)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeRoles(long pk, long[] rolePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeRoles(long pk,
		java.util.List<com.liferay.portal.model.Role> roles)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setRoles(long pk, long[] rolePKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setRoles(long pk,
		java.util.List<com.liferay.portal.model.Role> roles)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Team> getTeams(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Team> getTeams(long pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.Team> getTeams(long pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getTeamsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsTeam(long pk, long teamPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsTeams(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addTeam(long pk, long teamPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addTeam(long pk, com.liferay.portal.model.Team team)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addTeams(long pk, long[] teamPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addTeams(long pk,
		java.util.List<com.liferay.portal.model.Team> teams)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void clearTeams(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeTeam(long pk, long teamPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeTeam(long pk, com.liferay.portal.model.Team team)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeTeams(long pk, long[] teamPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeTeams(long pk,
		java.util.List<com.liferay.portal.model.Team> teams)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setTeams(long pk, long[] teamPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setTeams(long pk,
		java.util.List<com.liferay.portal.model.Team> teams)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.UserGroup> getUserGroups(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.UserGroup> getUserGroups(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.liferay.portal.model.UserGroup> getUserGroups(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int getUserGroupsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsUserGroup(long pk, long userGroupPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public boolean containsUserGroups(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addUserGroup(long pk, long userGroupPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addUserGroup(long pk,
		com.liferay.portal.model.UserGroup userGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addUserGroups(long pk, long[] userGroupPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void addUserGroups(long pk,
		java.util.List<com.liferay.portal.model.UserGroup> userGroups)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void clearUserGroups(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeUserGroup(long pk, long userGroupPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeUserGroup(long pk,
		com.liferay.portal.model.UserGroup userGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeUserGroups(long pk, long[] userGroupPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removeUserGroups(long pk,
		java.util.List<com.liferay.portal.model.UserGroup> userGroups)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setUserGroups(long pk, long[] userGroupPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void setUserGroups(long pk,
		java.util.List<com.liferay.portal.model.UserGroup> userGroups)
		throws com.liferay.portal.kernel.exception.SystemException;
}