package com.gateway.second_service.controller;

import com.gateway.second_service.service.SecondServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
public class SecondServiceController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to the Second Service";
    }

    @RequestMapping("/message")
    public String message() {
        return "Message from the second service";
    }
}
