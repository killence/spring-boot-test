package com.killen.springboot.server;

import com.killen.springboot.entity.UserDetail;
import com.killen.springboot.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @ClassName UserDetailServer
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
public interface UserDetailServer {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
