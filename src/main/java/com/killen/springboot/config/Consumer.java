package com.killen.springboot.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Consumer
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-03
 * @Version V1.0
 * 消费者
 **/
@Component
public class Consumer {

    @JmsListener(destination = "neo.queue")
    public void receiveQueue(String text){
        System.out.println("Consumer queue msg:"+text);
    }
}
