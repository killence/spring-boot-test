package com.killen.springboot.controller;

import com.killen.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-28
 * @Version V1.0
 **/
@RestController
public class UserController {

    @RequestMapping("/user")
    public String  getUser(String name){
        User user = User.builder().name("killen").age(22).pass("admin").build();
        return  "Hello World "+name;
    }
}
