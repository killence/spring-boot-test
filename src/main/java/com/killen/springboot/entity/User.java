package com.killen.springboot.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-03
 * @Version V1.0
 **/
@Data
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private String passWord;
    private String userSex;
    private String nickName;
}
