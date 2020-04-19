package cn.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author INS
 * @create 2020-04-10 17:24
 */
@Controller
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value = "/findAll")
    public String findAll(){
        return "hello/hello2";
    }
    @RequestMapping(value = "/findOne")
    public String findOne(){
        return "view/hello";
    }
}
