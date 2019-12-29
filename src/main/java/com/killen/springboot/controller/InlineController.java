package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @ClassName InlineController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-29
 * @Version V1.0
 **/
@Controller
public class InlineController {

    @RequestMapping("/inline")
    public String inline(ModelMap map){
        map.put("userName","thymeleaf inline");
        return "inline";
    }

    @RequestMapping("/object")
    public String object(HttpServletRequest request,ModelMap map){
        request.setAttribute("request","i am request");
        request.getSession().setAttribute("session","i am session");
        map.put("date",new Date());
        return "object";
    }

    @RequestMapping("/utility")
    public String utility(ModelMap map){
        map.put("date",new Date());
        map.put("userName","killen");
        map.put("age",22);
        map.put("pass","admin");
        map.put("count",10);
        return "utility";
    }

}
