package com.neo.dao;

import com.neo.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * RBAC
 * RBAC 是基于角色的访问控制（Role-Based Access Control ）在 RBAC 中，权限与角色相关联，用户通过成为适当角色的成员而得到这些角色的权限。这就极大地简化了权限的管理。这样管理都是层级相互依赖的，权限赋予给角色，而把角色又赋予用户，这样的权限设计很清楚，管理起来很方便。
 *
 * 采用 Jpa 技术来自动生成基础表格，对应的实体如下：
 *
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
