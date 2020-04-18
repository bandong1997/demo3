package cn.wink.test;

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
        //执行操作 p1:statementId   p2:输入的参数
        User user = sqlSession.selectOne("findUserById", 10);
        System.out.println(user);
        //关闭session
        sqlSession.close();
    }

    //添加用户
    @Test
    public void testMyBatis2() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user  = new User();
        user.setUsername("芈月");
        user.setPassword("123");
        user.setSex("2");
        user.setAddress("大秦");
        //执行添加 p1:statementId   p2:输入的参数
        sqlSession.insert("insertUser",user);
        //提交事务
        sqlSession.commit();
        //关闭session
        sqlSession.close();
    }

    //删除用户
    @Test
    public void testMyBatis3() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行删除 p1:statementId   p2:输入的参数
        sqlSession.delete("deleteUserById",28);
        //提交事务
        sqlSession.commit();
        //关闭session
        sqlSession.close();
    }
    //修改用户
    @Test
    public void testMyBatis4() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user  = new User();
        user.setId(29);
        user.setUsername("天明");
        user.setPassword("123");
        user.setSex("1");
        user.setAddress("咸阳宫");
        //执行修改 p1:statementId   p2:输入的参数
        sqlSession.update("updateUserById",user);
        //提交事务
        sqlSession.commit();
        //关闭session
        sqlSession.close();
    }

    //模糊查询
    @Test
    public void testMyBatis5() throws Exception {

        //获取sqlSessionFactory工厂
        //String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行模糊查询 p1:statementId   p2:输入的参数
        /**
         * #{}和${}的区别:
         * #{}:占位符(相当于占位符),会自动对传入的字符串数据加一对单引号
         * ${}:拼接符 如果传入的是基本数据类型和String类型,大括号中只能写value,即${value}.
         * 如果传入的是POJO或者Map类型,大括号中只能写属性名或key名
         * ${username}
         */
        //List<User> UserList = sqlSession.selectList("findUserByNameOrLike", "%张%");
        List<User> UserList = sqlSession.selectList("findUserByNameOrLike", "张");
        for (User user : UserList){
            System.out.println(user);
        }
        //提交事务
        sqlSession.commit();
        //关闭session
        sqlSession.close();
    }






















































































}
