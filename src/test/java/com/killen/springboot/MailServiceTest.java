package com.killen.springboot;

import com.killen.springboot.repository.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName MailServiceTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-08
 * @Version V1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;
    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("1982345724@qq.com","这是⼀封简单邮件","⼤家好，这是我的第⼀封邮件！");
    }
}
