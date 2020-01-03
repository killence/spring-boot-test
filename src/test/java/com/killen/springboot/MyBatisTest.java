package com.killen.springboot;


import com.killen.springboot.entity.User;
import com.killen.springboot.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-03
 * @Version V1.0
 **/
@SpringBootTest
public class MyBatisTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void test1(){
        User user = User.builder().userName("killen").nickName("123").passWord("admin").userSex("male").build();

        userMapper.insert(user);
    }

    @Test
    public void getAll1(){
        List<User> users = userMapper.getAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
