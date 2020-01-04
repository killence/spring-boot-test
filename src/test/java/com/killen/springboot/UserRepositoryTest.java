package com.killen.springboot;

import com.killen.springboot.entity.User;
import com.killen.springboot.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName UserRepositoryTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-03
 * @Version V1.0
 **/
@SpringBootTest
public class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void test(){
        //userRepository.save(User.builder().userName("killen1").nickName("abc1").passWord("1").email("16544017661@qq.com").regTime("1997-11").build());
        Optional<User> user = userRepository.findById(1L);
        System.out.println(user);
    }
}
