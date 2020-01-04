package com.killen.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName UserDetail
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-04
 * @Version V1.0
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private Long userId;
    private Integer age;
    private String realName;
    private String status;
    private String hobby;
    private String introduction;
    private String lastLoginIp;
}
