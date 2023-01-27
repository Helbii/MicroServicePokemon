package com.IMT.UserService.Queue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

class Price {
    double value;
    String currency;
}

@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void receive(String in) throws InterruptedException, JsonProcessingException {
        String json = "{\"value\": 100.0, \"currency\": \"Pokedollars\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Price price = objectMapper.readValue(json, Price.class);
    }
}