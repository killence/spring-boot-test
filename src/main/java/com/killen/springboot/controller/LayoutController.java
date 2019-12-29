package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LayoutController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-29
 * @Version V1.0
 **/
@Controller
public class LayoutController {

    @RequestMapping("/layout")
    public String layout(){
        return "layout";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
