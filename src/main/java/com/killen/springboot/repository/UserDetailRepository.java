package com.killen.springboot.repository;

import com.killen.springboot.entity.UserDetail;
import com.killen.springboot.entity.Userinfo;
import com.killen.springboot.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Date 2020-01-04
 * 接口可以多继承
 * 复杂查询
 **/
public interface UserDetailRepository extends JpaSpecificationExecutor<UserDetail>,JpaRepository<UserDetail, Long> {
    @Query("select u.userName as userName, u.email as email, d.introduction as introduction , d.hobby as hobby from User u , UserDetail d " + "where u.id=d.userId and d.hobby = ?1 ")
    List<Userinfo> findUserInfo(String hobby);
}
