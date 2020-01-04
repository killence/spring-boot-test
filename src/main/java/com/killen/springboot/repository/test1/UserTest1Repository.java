package com.killen.springboot.repository.test1;

import com.killen.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserTest1Repository
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
public interface UserTest1Repository extends JpaRepository<User, Long> {

    User findById(long id);
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
