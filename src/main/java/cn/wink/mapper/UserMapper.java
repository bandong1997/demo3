package cn.wink.mapper;

import cn.wink.pojo.QueryVo;
import cn.wink.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author INS
 * @create 2020-04-18 21:30
 * 用户
 * mapper层接口即是 Dao层
 */
public interface UserMapper {
    //根据id查询用户信息
    User findUserById(int id);
    //查询所有用户信息
    List<User> findAll();
    //输入类型映射是Map类型
    List<User> findUserByMap(Map map);
    //输入类型是包装POJO
    List<User>findByQueryVo(QueryVo queryVo);

    //输出类型是基础数据诶性(基本数据类型和String类型)
    int findCount();
    //输出类型是Map类型
    Map<String,Object>findResultMap(int id);
    //resultMap 手动配置列和属性的映射
    User findResultMap1(int id);

    /**
     * 动态sql
     */
    //if和where标签
    List<User>findByUser(User user);
    //foreach标签:对一个集合进行遍历,通常是在构建in条件语句的时候
    //如果直接传入的是数组或者集合 映射文件foreach标签中的collection:参数的类型,如果是集合:list 如果是数组:array
    List<User>findUserByIdIn(List list);
    //如果将集合或者数组放到属性里面要按照实体中的属性去取
    List<User>findUserByIdIn1(QueryVo queryVo);


    /**
     * 一对多
     */
    //查询所有用户并把有关联的一并查询
    List<User>findAllUserAccount();
}
