package com.micro.inventoryservice.config;

import com.micro.inventoryservice.queue.Receiver;
import org.springframework.amqp.core.Queue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class QueueConfig {

    @Bean
    public Queue hatching() {
        return new Queue("hello");
    }

    @Bean
    public Receiver receiver() {
        return new Receiver();
    }
}