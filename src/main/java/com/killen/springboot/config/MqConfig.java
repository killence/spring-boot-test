package com.killen.springboot.config;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;


/**
 * @ClassName MqConfig
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-03
 * @Version V1.0
 **/
@Configuration
public class MqConfig {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("neo.queue");
    }
}
