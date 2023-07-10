package com.gateway.first_service.controller;

import com.gateway.first_service.service.FirstServiceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/first-service")
public class FirstServiceController {

    @Autowired
    private FirstServiceService firstServiceService;


    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First Service";
    }

    @PostMapping("/message")
    public void message(@RequestBody String message) {
        log.info("Sending message to kafka");
        firstServiceService.sendMessage("first-service", message);
    }
}
