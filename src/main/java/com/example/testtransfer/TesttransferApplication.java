package com.example.testtransfer;

import com.example.testtransfer.kafka.KafkaReceiveMessage;
import com.example.testtransfer.rabbitmq.RabbitMQSendMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesttransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesttransferApplication.class, args);
	}

}
