package cn.dw.test;

import cn.dw.mapper.RoleMapper;
import cn.dw.mapper.UserMapper;
import cn.dw.pojo.Role;
import cn.dw.pojo.User;
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
 * 理解多对多
 */
public class ManyToMany {
    //查询所有用户信息并把用户所关联的角色查询出来
    @Test
    public void findUserAllAndRoleAll() throws Exception {
        //加载mybatis全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取sqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //执行操作
        List<User> userList = userMapper.findUserAllAndRoleAll();
        for (User user : userList){
            System.out.println(user);
        }
        //关闭sesion
        sqlSession.close();
    }
    //查询所有角色信息并把用户所关联的用户查询出来
    @Test
    public void findRoleAllAndUserAll() throws Exception {
        //加载mybatis全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取sqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        //执行操作
        List<Role> roleList = roleMapper.findRoleAllAndUserAll();
        for (Role role : roleList){
            System.out.println(role);
        }
        //关闭sesion
        sqlSession.close();
    }





























}
