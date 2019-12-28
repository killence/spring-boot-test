package com.killen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TyController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-28
 * @Version V1.0
 **/
@Controller
public class TyController {


    @RequestMapping("/index")
        public String index(ModelMap map) {
            map.addAttribute("message", "http://www.ityouknow.com");
            return "index";
        }

}
