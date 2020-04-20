package cn.dw.mapper;

import cn.dw.pojo.User;

import java.util.List;

/**
 * @author INS
 * @create 2020-04-20 16:33
 * 用户mapper接口
 */
public interface UserMapper {
    //查询所有用户信息并把用户所关联的角色查询出来
    List<User>findUserAllAndRoleAll();
}
