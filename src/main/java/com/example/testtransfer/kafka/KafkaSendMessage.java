package com.example.testtransfer.kafka;

import com.example.testtransfer.MessageSender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
public class KafkaSendMessage implements MessageSender {
    @Value("${kafka.topic.send}")
    private String sendTopic;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaSendMessage(ObjectMapper objectMapper, ModelMapper modelMapper ,KafkaTemplate<String, String> kafkaTemplate) {
        this.objectMapper = objectMapper;
        this.modelMapper = modelMapper;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(Object message) throws JsonProcessingException {
        log.info(message.toString());
        String orderAsMessage = objectMapper.writeValueAsString(message);
        kafkaTemplate.send(sendTopic,0, String.valueOf(0), orderAsMessage);
    }
}
