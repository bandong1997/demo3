package cn.wink.test;

import cn.wink.mapper.AccountMapper;
import cn.wink.pojo.Account;
import cn.wink.pojo.UserAndAccount;
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
 * 理解一对一
 */
public class OneToOne {
    //查询所有账户
    @Test
    public void testFindAll() throws Exception {
        //加载mybatis全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取sqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        //执行操作
        List<Account> accountList = accountMapper.findAll();
        for (Account account : accountList){
            System.out.println(account);
        }
        //关闭sesion
        sqlSession.close();
    }

    /**
     * 查询所有用户并且查询账户对应的用户信息查询出来
     */

    @Test
    public void testFindAll1() throws Exception {
        //加载mybatis全局配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获取sqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //打开session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取动态代理对象
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        //执行操作
        //解决方案一：创建新的pojo类包含这两个实体的属性
        List<UserAndAccount> userAndAccountList = accountMapper.findAll1();
        for (UserAndAccount userAndAccount : userAndAccountList){
            System.out.println("方案一:"+userAndAccount);
        }
        //解决方案二：配置映射文件，通过resultMap做映射
        List<Account> accountList1 = accountMapper.findAll2();
        for (Account account : accountList1){
            System.out.println("方案二:"+account);
        }
        //解决方案三：配置映射文件2，通过resultMap做映射
        List<Account> accountList2 = accountMapper.findAll3();
        for (Account account : accountList2){
            System.out.println("方案三:"+account);
        }
        //关闭sesion
        sqlSession.close();
    }




























}
