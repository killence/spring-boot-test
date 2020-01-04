package com.killen.springboot.entity;

/**
 * @ClassName Userinfo
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 * 多表查询
 * 创建⼀个结果集的接口来接收连表查询后的结果
 * 在运行中 Spring 会给接口（UserInfo）自动生产⼀个代理类来接收返回的结果，代码中使用 getXX 的形式来获取
 **/
public interface Userinfo {
    String getUserName();
    String getEmail();
    String getHobby();
    String getIntroduction();
}
