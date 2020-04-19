package cn.dw.controller;

import cn.dw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author INS
 * @create 2020-04-11 14:16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值是String类型
     * 1.默认情况:是请求转发,返回值直接进入视图解析器,拼接前缀和后缀,形成完整路径
     */
    @RequestMapping(value = "/test1")
    public String test1(){
        System.out.println("测试方1法执行...");
        return "test";
    }

    /**
     * 2.请求转发:forward 不会进入视图解析器,需要配置完整路径
     */
    @RequestMapping(value = "/test2")
    public String test2(){
        System.out.println("测试方2法执行...");
        return "forward:/jsp/test2.jsp";
    }

    /**
     * 3.重定向:redirect 不会进入视图解析器,需要配置完整路径
     *   注意:重定向不能进入WEB-INF目录
     */
    @RequestMapping(value = "/test3")
    public String test3(){
        System.out.println("测试方3法执行...");
        return "redirect:/jsp/test2.jsp";
    }


    /**
     * 返回值为ModelAndView类型
     * Model 模型:封装数据 View 视图:指定页面
     */

    @RequestMapping("/test4")
    public ModelAndView test4(){
        //从数据库查询
        User user = new User(1, "张三", 18);
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("user",user);
        //指定页面
        modelAndView.setViewName("test");
        return modelAndView;
    }

    /**
     * 这种没有返回值的他会直接在你配置的视图解析器后面加上他的请求路径来拼接
     * HTTP Status 404 - /j191001_springmvc_03/WEB-INF/view/user/test5.jsp
     * 了解
     */
    @RequestMapping("/test5")
    public void test5(){
        System.out.println("测试方5法执行...");
    }

    /**
     * servlet的方式  了解
     */
    @RequestMapping("/test6")
    public void test6(HttpServletRequest request, HttpServletResponse response){
        System.out.println("测试方5法执行...");

        try {
            request.getRequestDispatcher("/jsp/test2.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * json数据交换
     */
    @RequestMapping("/testRequestJson1")
    public void testRequestJson1(User user){
        System.out.println(user);
    }
    @RequestMapping("/testRequestJson2")
    public void testRequestJson2(int id,String name,int age){
        System.out.println(id+name+age);
    }

    //RequestBody注解:把请求的参数转换为字符串
    //id=1&name=%E4%BB%B2%E8%B0%8B&age=18 用的时候需要截取  不建议
    @RequestMapping("/testRequestJson3")
    public void testRequestJson3(@RequestBody String string){
        System.out.println(string);
    }

    //ResponseBody注解:标记了@ResponseBody注解的方法,数据都会以流的方式返回
    @RequestMapping("/testRequestJson4")
    @ResponseBody
    public List<User> testResponseJson4(){
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setId(1);
        user1.setName("李四");
        user1.setAge(15);
        User user2 = new User();
        user2.setId(2);
        user2.setName("王五");
        user2.setAge(16);
        list.add(user1);
        list.add(user2);

        return list;
    }


    //converter
    @RequestMapping("/converter")
    public String converter(Date datetime){
        System.out.println(datetime);
        return "test";
    }













}
