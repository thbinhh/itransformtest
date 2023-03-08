package com.example.testtransfer;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public interface MessageSender {

//    @Value("${message.receiver.type}")
//    private String receiverSender = "rabbitmq";
//
//    @Autowired
//    private MessageBroker messageBroker;
//    @Autowired
//    private KafkaMessageBroker kafkaMessageBroker;
//
//    @Autowired
//    private RabbitMQMessageBroker rabbitMQMessageBroker;
//
//    public MessageSender() {
//        if ("kafka".equals(receiverSender)) {
//            System.out.println(receiverSender);
//            this.messageBroker = kafkaMessageBroker;
//        } else if ("rabbitmq".equals(receiverSender)) {
//            this.rabbitMQMessageBroker = rabbitMQMessageBroker;
//        } else {
//            throw new IllegalArgumentException("Invalid message sender type: " + receiverSender);
//        }
//        this.messageBroker = kafkaMessageBroker;
//    }
//
    public void sendMessage(Object message) throws JsonProcessingException;
}
