package com.killen.springboot;

import com.killen.springboot.entity.User;
import com.killen.springboot.server.UserServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 多数据源进行测试
 * @ClassName MoneyDataSourceTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/
@SpringBootTest
public class MoneyDataSourceTest {

    @Autowired
    private UserServer userRepository;
    @Autowired
    private JdbcTemplate primaryJdbcTemplate;
    @Autowired
    private JdbcTemplate secondaryJdbcTemplate;

    @Test
    public void testSave() {
        User user =User.builder().name("killen").password("admin").age(20).build();
        userRepository.save(user,primaryJdbcTemplate);
        userRepository.save(user,secondaryJdbcTemplate);
    }
}
