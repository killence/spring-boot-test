package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * @ClassName WebController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-28
 * @Version V1.0
 **/
@Controller
public class WebController {

    @GetMapping("/welcome")
    public String welcome(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","Hello World");
        return "welcome";
    }

}
