package com.killen.springboot;

import com.killen.springboot.entity.User;
import com.killen.springboot.test1.User1Mapper;
import com.killen.springboot.test2.User2Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName ManyDataSourceTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-03
 * @Version V1.0
 **/
@SpringBootTest
public class ManyDataSourceTest {

    @Resource
    private User1Mapper user1Mapper;

    @Resource
    private User2Mapper user2Mapper;

    @Test
    public void insert(){
        User user =  User.builder().userName("123").nickName("456").passWord("789").userSex("male").build();
        user1Mapper.insert(user);
        user2Mapper.insert(user);
    }
}
