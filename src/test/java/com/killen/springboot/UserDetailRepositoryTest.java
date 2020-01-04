package com.killen.springboot;

import com.killen.springboot.entity.UserDetail;
import com.killen.springboot.param.UserDetailParam;
import com.killen.springboot.repository.UserDetailRepository;
import com.killen.springboot.server.UserDetailServer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.Resource;

/**
 * @ClassName UserDetailRepository
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
@SpringBootTest
public class UserDetailRepositoryTest {

    @Resource
    private UserDetailRepository userDetailRepository;
    @Resource
    private UserDetailServer userDetailServer;

    @Test
    public void testsave(){
        UserDetail userDetail = new UserDetail();
        userDetail.setUserId(2L);
        userDetail.setHobby("吃鸡游戏");
        userDetail.setAge(28);
        userDetail.setIntroduction("一个爱玩的人");
        userDetailRepository.save(userDetail);
    }

    @Test
    public void testFindByCondition() {
        int page=0,size=10;
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        UserDetailParam param=new UserDetailParam();
        param.setIntroduction("程序员");
        param.setMinAge(10);
        param.setMaxAge(30);
        Page<UserDetail> page1= userDetailServer.findByCondition(param,pageable);
        for (UserDetail userDetail:page1){
            System.out.println("userDetail: "+userDetail.toString());
        }
    }

}
