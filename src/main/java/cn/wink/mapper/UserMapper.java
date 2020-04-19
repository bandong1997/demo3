package cn.wink.mapper;

import cn.wink.pojo.QueryVo;
import cn.wink.pojo.User;

import java.util.List;
import java.util.Map;

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
}
