package cn.dw.controller;

import cn.dw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author INS
 * @create 2020-04-10 20:27
 */
@RequestMapping("/user")
@Controller
public class UserController {

    /**
     * 基本数据类型或者String类型:
     * 要求我们的参数名称必须和控制器中方法的形参名称保持一致.(严格区分大小写)
     */
    @RequestMapping("/login")
    public String login(String username,String password,int age){
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        return "user/login";
    }
    /**
     *  POJO类型或者它的关联对象:
     * 要求表单中参数的名称和POJO类的属性名称保持一致.并且控制器方法的参数类型是POJO类型
     */
    @RequestMapping("/login2")
    public String login2(User user){
        System.out.println(user);
        return "user/login";
    }

    /**
     *  集合类型:要求集合类型的请求参数必须在POJO中.
     *  在表单中请求参数名称要和POJO中集合的属性名称相同
     *  •	给List集合中的元素赋值,使用下标
     */
    @RequestMapping("/login3")
    public String login3(User user){
        System.out.println(user);
        return "user/login";
    }

    /**
     * 特殊情况的参数绑定
     * @RequestParam：请求参数绑定,name与参数名不一致
     */
    @RequestMapping("/login4")
    public String login4(@RequestParam("username") String name){
        System.out.println(name);
        return "user/login";
    }
}
