package com.killen.springboot;

import com.killen.springboot.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName ServiceTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-05
 * @Version V1.0
 **/
@SpringBootTest
public class ServiceTest {

    @Resource
    private RedisService redisService;

    @Test
    public void test(){
        boolean age = redisService.set("age", 22);
        System.out.println(age);
    }

    @Test
    public void getAge(){
        Integer age = (Integer) redisService.get("age");
        System.out.println(age);
    }
}
