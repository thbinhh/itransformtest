package com.example.testtransfer;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface MessageReceiver {
    public void receiveMessage(String message) throws JsonProcessingException;
}
