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
 * @create 2020-04-19 17:54
 * 理解一对多
 */
public class OneToMany {
    //查询所有用户并把有关联的一并查询
    @Test
    public void testFindAllUserAccount() throws Exception {
        //加载mybatis全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取sqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        List<User> userList = userMapper.findAllUserAccount();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭sesion
        sqlSession.close();
    }





























}
