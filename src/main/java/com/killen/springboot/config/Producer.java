package com.killen.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @ClassName Producer
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-03
 * @Version V1.0
 * 生产者
 **/
@Component
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void sendQueue(String msg) {
        System.out.println("send queue msg :"+msg);
        jmsMessagingTemplate.convertAndSend(queue, msg);
    }


}
