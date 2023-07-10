package com.gateway.second_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SecondServiceService {

    @KafkaListener(topics = "first-service", groupId = "second-service")
    public void consume(String message) {
        log.info("Consumed message: {}", message);
    }
}
