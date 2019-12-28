package com.killen.springboot.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description: TODO
 * @Author killen
 * @Date 2019-12-28
 * @Version V1.0
 **/
@Data
@Builder
public class User implements Serializable {

    private String name;
    private int age;
    private String pass;

}
