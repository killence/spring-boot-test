package com.killen.springboot.test1;

import com.killen.springboot.entity.User;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-03
 * @Version V1.0
 **/
public interface User1Mapper {

    void insert(User user);

    List<User> getAll();

    @Delete("DELETE FROM users WHERE id = #{id}")
    void delete(Long id);
}
