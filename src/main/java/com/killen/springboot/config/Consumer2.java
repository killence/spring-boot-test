package com.killen.springboot.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Consumer2
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-03
 * @Version V1.0
 **/
@Component
public class Consumer2 {

    @JmsListener(destination = "neo.queue")
    public void receiveQueue(String text){
        System.out.println("Consumer2 queue msg:"+text);
    }
}
