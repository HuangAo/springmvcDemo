package com.huang.controller;

import com.huang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :huangao
 */

@Controller
@RequestMapping("/user")
public class UserController {

    //用对象接收前端参数，要求字段名一致
    //http://localhost:8080/springmvc_04_controller_war_exploded/user/add?name=huang&age=1
    @GetMapping("/add")
    public String addUser(User user){
        System.out.println(user);
        return "hello";
    }
}
