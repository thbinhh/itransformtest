package com.example.testtransfer.rabbitmq;

import com.example.testtransfer.MessageReceiver;
import com.example.testtransfer.MessageSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class RabbitMQSendMessage implements MessageSender {
    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;
    private final RabbitTemplate rabbitTemplate;

    public RabbitMQSendMessage(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMessage(Object message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
