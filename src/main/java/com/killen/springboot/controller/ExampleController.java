package com.killen.springboot.controller;

import com.killen.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExampleController
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-29
 * @Version V1.0
 **/
@Controller
public class ExampleController {

    @RequestMapping("/string")
    public String string(ModelMap modelMap){
        modelMap.put("userName","killen");
        return "string";
    }

    @RequestMapping("/if")
    public String if_unless(ModelMap map){
        map.put("flag","yes");
        return "if_unless";
    }

    @RequestMapping("/userList")
    public String userList(ModelMap map){
        map.put("users",getUserList());
        map.put("url","http://www.baidu.com");
        return "userList";
    }

    @RequestMapping("/switch")
    public String switchcase(ModelMap map){
        map.put("sex","an");
        return "sex";
    }

    @RequestMapping("/url")
    public String url(ModelMap map){
        map.put("type","link");
        map.put("pageId","springcloud/2017/09/11/");
        map.put("img","http://www.ityouknow.com/assets/images/neo.jpg");
        map.put("url","http://www.baidu.com");
        return "url";
    }



    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User("⼤⽜",12,"123456");
        User user2=new User("⼩⽜",6,"123563");
        User user3=new User("纯洁的微笑",66,"666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
