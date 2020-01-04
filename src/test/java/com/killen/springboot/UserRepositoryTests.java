package com.killen.springboot;

import com.killen.springboot.entity.User;
import com.killen.springboot.repository.test1.UserTest1Repository;
import com.killen.springboot.repository.test2.UserTes21Repository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

/**
 * @ClassName UserRepositoryTests
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
@SpringBootTest
public class UserRepositoryTests {
    @Resource
    private UserTest1Repository userTest1Repository;
    @Resource
    private UserTes21Repository userTes21Repository;

    @Test
    public void testSave(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userTest1Repository.save(User.builder().userName("aa").passWord("aa").regTime(formattedDate).email("123@qq.com").nickName("aa").build());
        userTest1Repository.save(User.builder().userName("bb").passWord("bb").regTime(formattedDate).email("1234@qq.com").nickName("bb").build());
        userTes21Repository.save(User.builder().userName("cc").passWord("cc").regTime(formattedDate).email("1235@qq.com").nickName("cc").build());
    }
}
