package com.example.testtransfer.controller;

import com.example.testtransfer.dto.FoodOrderDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-message")
public class SendMessageController {

//    @Autowired
//    private MessageSender messageSender;

    @PostMapping
    public void sendMessage(@RequestBody FoodOrderDTO foodOrderDTO) throws JsonProcessingException {
//        messageSender.sendMessage(foodOrderDTO);
    }
}
