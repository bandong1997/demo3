package cn.wink.test;

import cn.wink.mapper.UserMapper;
import cn.wink.pojo.QueryVo;
import cn.wink.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author INS
 * @create 2020-04-17 21:14
 * 动态sql
 */
public class TestMyBatis2 {
    //if和where
    @Test
    public void test1() throws Exception {
        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //设置条件
        User user = new User();
        user.setUsername("张");
        user.setSex("1");
        user.setAddress("河南郑州");
        //执行操作
        List<User> userList = userMapper.findByUser(user);
        for (User user1 : userList){
            System.out.println(user1);
        }
        //关闭session
        sqlSession.close();
    }
    //foreach标签:对一个集合进行遍历,通常是在构建in条件语句的时候-
    @Test
    public void test2() throws Exception {
        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //设置条件
        List list = new ArrayList<>();
        list.add(29);
        list.add(30);
        QueryVo queryVo = new QueryVo();
        queryVo.setIds(list);
        //执行操作
        //传入的是集合或数组
        List<User> userList = userMapper.findUserByIdIn(list);
        for (User user1 : userList){
            System.out.println(user1);
        }
        System.out.println("---------------");
        //将集合数组放到实体中根据实体属性去取
        List<User> userByIdIn1 = userMapper.findUserByIdIn1(queryVo);
        for (User user2 : userByIdIn1){
            System.out.println(user2);
        }
        //关闭session
        sqlSession.close();
    }























































































}
