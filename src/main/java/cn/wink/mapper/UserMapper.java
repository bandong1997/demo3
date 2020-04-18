package cn.wink.mapper;

import cn.wink.pojo.User;

import java.util.List;

/**
 * @author INS
 * @create 2020-04-18 21:30
 * mapper层接口即是 Dao层
 */
public interface UserMapper {
    //根据id查询用户信息
    User findUserById(int id);
    //查询所有用户信息
    List<User> findAll();
}
