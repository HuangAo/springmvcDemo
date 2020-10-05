package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :huangao
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("msg","Hello, SpringMVC annotation");
        return "hello"; //@Controller会被视图解析器解析，@RestController不会
    }
}
