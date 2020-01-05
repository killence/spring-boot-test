package com.killen.springboot.repository;

import com.killen.springboot.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @ClassName UserRepositry
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-05
 * @Version V1.0
 **/
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u")
    Page<User> findList(Pageable pageable);

    User findById(long id);

    User findByUserName(String userName);

    void deleteById(Long id);
}
