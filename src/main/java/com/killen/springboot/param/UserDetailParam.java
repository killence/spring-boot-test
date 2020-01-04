package com.killen.springboot.param;

import lombok.Data;

/**
 * @ClassName UserDetailParam
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
@Data
public class UserDetailParam {
    private String userId;
    private Integer minAge;
    private Integer maxAge;
    private String realName;
    private String introduction;
    private String city;
}
