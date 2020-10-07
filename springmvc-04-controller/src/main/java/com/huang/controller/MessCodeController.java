package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author :huangao
 */
@Controller
public class MessCodeController {

    @PostMapping("/messcode/test")
    public String messcodetest(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hello";
    }
}
