package com.huang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :huangao
 */
//@Controller
@RestController
public class JsonTestController {

    //@ResponseBody //使用@RestController后不需要@ResponseBody了
    @GetMapping("/jsontest")
    public String jsonTest() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("huang",18,"男");
        // jackson：对象转json串
        String jsonstr = mapper.writeValueAsString(user);
        return jsonstr;
    }
}
