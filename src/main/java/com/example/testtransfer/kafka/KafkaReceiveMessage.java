package com.example.testtransfer.kafka;

import com.example.testtransfer.MessageReceiver;
import com.example.testtransfer.MessageSender;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//@Component
public class KafkaReceiveMessage implements MessageReceiver {

    private final String listenTopic = "${kafka.topic.listen}";

    @Autowired
    private MessageSender messageSender;

    @Override
    @KafkaListener(topics = listenTopic, groupId = "default")
    public void receiveMessage(String message) throws JsonProcessingException {
        System.out.println(message);
        messageSender.sendMessage(message);
    }
}
