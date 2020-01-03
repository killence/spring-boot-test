package com.killen.springboot.server;

import com.killen.springboot.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServer
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/

public interface UserServer {
    int save(User user, JdbcTemplate jdbcTemplate);

}
