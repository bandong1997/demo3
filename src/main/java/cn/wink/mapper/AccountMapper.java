package cn.wink.mapper;

import cn.wink.pojo.Account;
import cn.wink.pojo.UserAndAccount;

import java.util.List;

/**
 * @author INS
 * @create 2020-04-19 17:51
 * 账户
 */
public interface AccountMapper {
    //查询所有用户
    List<Account> findAll();
    /**
     * 查询所有用户并且查询账户对应的用户信息查询出来
     *
     */
    //方案一:创建新的pojo类包含这两个实体的属性
    List<UserAndAccount>findAll1();
    //方案二：配置映射文件1，通过resultMap做映射
    List<Account>findAll2();
    //方案三：配置映射文件2，通过resultMap做映射
    List<Account>findAll3();
}
