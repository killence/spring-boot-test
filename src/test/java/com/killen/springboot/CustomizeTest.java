package com.killen.springboot;

import com.killen.springboot.entity.User;
import com.killen.springboot.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CustomizeTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
@SpringBootTest
public class CustomizeTest {

    @Resource
    private UserRepository userRepository;

    /**
     * 测试自己定义的方法
     */
    @Test
    public void test(){
        int user = userRepository.modifyById("周利冬", 1L);
        System.out.println(user);

    }

    @Test
    public void findAllUser(){
        List<User> allUser = userRepository.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }

    @Test
    public void testPageQuery()  {
        int page=1,size=2;
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<User> all = userRepository.findALL(pageable);
        //userRepository.findByNickName("aa", pageable);
    }

}
