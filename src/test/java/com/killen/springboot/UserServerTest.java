package com.killen.springboot;

import com.killen.springboot.entity.User;
import com.killen.springboot.server.UserServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName UserServerTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/

@SpringBootTest
public class UserServerTest {

    @Autowired
    private UserServer userServer;

//    @Test
//    public void testSave(){
//        User user = User.builder().name("abc").password("123").age(21).build();
//        userServer.save(user);
//    }

//    @Test
//    public void updateUser(){
//        User user = User.builder().name("abc").password("admin").age(22).build();
//        user.setId(2L);
//        int update = userServer.update(user);
//        System.out.println(update);
//    }
//
//    @Test
//    public void deleteUser(){
//        int delete = userServer.delete(2L);
//        System.out.println(delete);
//    }
//
//    @Test
//    public void testQueryOne(){
//        List<User> alluser = userServer.findALL();
//        for (User user : alluser) {
//            System.out.println(user);
//        }
//    }
}
