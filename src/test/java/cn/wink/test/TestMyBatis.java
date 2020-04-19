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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //输入映射是Map类型
    @Test
    public void testMyBatis3() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //设置条件
        Map<String,Object> map = new HashMap<>();
        map.put("username","张");
        map.put("sex","1");
        map.put("address","河南郑州");

        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        List<User> userList = userMapper.findUserByMap(map);
        for(User user : userList){
            System.out.println(user);
        }
        //关闭session
        sqlSession.close();
    }
    //输入类型是包装POJO
    @Test
    public void testMyBatis4() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //设置条件
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUsername("天");
        queryVo.setUser(user);

        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        List<User> userList = userMapper.findByQueryVo(queryVo);
        for(User user1 : userList){
            System.out.println(user1);
        }
        //关闭session
        sqlSession.close();
    }
    //输出类型是基础数据诶性(基本数据类型和String类型)
    @Test
    public void testMyBatis5() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        int count = userMapper.findCount();
        System.out.println(count);
        //关闭session
        sqlSession.close();
    }
    //输出类型是Map类型
    @Test
    public void testMyBatis6() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        Map<String, Object> resultMap = userMapper.findResultMap(1);
        System.out.println(resultMap);
        //关闭session
        sqlSession.close();
    }
    //resultMap 手动配置列和属性的映射
    @Test
    public void testMyBatis7() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        User user = userMapper.findResultMap1(29);
        System.out.println(user);
        //关闭session
        sqlSession.close();
    }























































































}
