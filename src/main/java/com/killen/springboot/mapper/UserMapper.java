package com.killen.springboot.mapper;

import com.killen.springboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-03
 * @Version V1.0
 **/
public interface UserMapper {

    void insert(User user);

    List<User> getAll();
}
