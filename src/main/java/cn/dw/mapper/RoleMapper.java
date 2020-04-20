package cn.dw.mapper;

import cn.dw.pojo.Role;

import java.util.List;

/**
 * @author INS
 * @create 2020-04-20 16:33
 * 角色mapper接口
 */
public interface RoleMapper {
    //查询所有角色信息并把用户所关联的用户查询出来
    List<Role> findRoleAllAndUserAll();
}
