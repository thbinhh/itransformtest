package com.example.testtransfer.rabbitmq;

import com.example.testtransfer.MessageReceiver;
import com.example.testtransfer.MessageSender;
import com.example.testtransfer.kafka.KafkaSendMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class RabbitMQReceiveMessage implements MessageReceiver {
    @Autowired
    private MessageSender messageSender;

    @Override
    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void receiveMessage(String message) throws JsonProcessingException {
        System.out.println(message);
        messageSender.sendMessage(message);
    }
}
