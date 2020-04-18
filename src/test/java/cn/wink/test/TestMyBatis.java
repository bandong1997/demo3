package cn.wink.test;

import cn.wink.mapper.UserMapper;
import cn.wink.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author INS
 * @create 2020-04-17 21:14
 */
public class TestMyBatis {


    //根据id查询用户信息
    @Test
    public void testMyBatis1() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        User user = userMapper.findUserById(10);
        System.out.println(user);
        //关闭session
        sqlSession.close();
    }
    //查询所有用户信息
    @Test
    public void testMyBatis2() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        List<User> userList = userMapper.findAll();
        for(User user : userList){
            System.out.println(user);
        }
        //关闭session
        sqlSession.close();
    }























































































}
