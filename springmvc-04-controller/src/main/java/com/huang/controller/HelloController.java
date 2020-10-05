package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :huangao
 */
@Controller
public class HelloController {

    // @RequestMapping("/hello/{a}/{b}")
    @GetMapping("/hello/{a}/{b}")
    public String hello1(@PathVariable int a, @PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg","result is:" + result);
        return "hello";
    }
}
