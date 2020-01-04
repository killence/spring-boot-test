package com.killen.springboot.repository.test2;

import com.killen.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserTest1Repository
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
public interface UserTes21Repository extends JpaRepository<User, Long> {

    User findById(long id);
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
