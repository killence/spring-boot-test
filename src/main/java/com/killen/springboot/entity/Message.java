package com.killen.springboot.entity;

import lombok.Data;

/**
 * @ClassName Message
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/
@Data
public class Message {

    private Long id;
    private String text;
    private String summary;

}
