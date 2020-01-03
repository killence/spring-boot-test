package com.killen.springboot.server.impl;

import com.killen.springboot.entity.User;
import com.killen.springboot.entity.UserRowMapper;
import com.killen.springboot.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServerImpl
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/
@Repository
public class UserServerImpl implements UserServer {
    //JdbcTemplate其是 Spring 操作JDBC 提供的⼯具类。
    @Autowired
    private JdbcTemplate primaryJdbcTemplate;

    @Override
    public int save(User user,JdbcTemplate jdbcTemplate) {
        if(jdbcTemplate == null){
            jdbcTemplate= primaryJdbcTemplate;
        }
        return jdbcTemplate.update("INSERT INTO users(name, password, age) values(?, ?, ?)",
                user.getName(), user.getPassword(), user.getAge());
    }

}
