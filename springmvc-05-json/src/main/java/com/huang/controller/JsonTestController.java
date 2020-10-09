package com.huang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huang.pojo.User;
import com.huang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/jsontest2")
    public String jsonTest2(){
        List<User> userList = new ArrayList();
        User user1 = new User("huang",18,"男");
        User user2 = new User("james",19,"男");
        userList.add(user1);
        userList.add(user2);
        return JsonUtils.getJson(userList);
    }
}
