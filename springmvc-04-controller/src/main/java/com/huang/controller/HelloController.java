package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author :huangao
 */
@Controller
public class HelloController {

    @GetMapping("/hello/{a}/{b}")
    public String hello1(@PathVariable int a, @PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","(Get method)result is:" + result);
        return "hello";
    }

    @PostMapping("/hello/{a}/{b}") // 需用POST方式访问
    public String hello2(@PathVariable int a, @PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","(POST method)result is:" + result);
        return "hello";
    }

    //当前端请求参数名和方法里的参数名一致时，可直接接收
    //http://localhost:8080/springmvc_04_controller_war_exploded/paramsTest?name=huang
    @GetMapping("/paramsTest")
    public String getParameterTest(String name){
        System.out.println(name);
        return "hello";
    }

    //当前端请求参数名和方法里的参数名不一致时，用@RequestParam指定
    @GetMapping("/paramsTest2")
    public String getParameterTest2(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }


}
