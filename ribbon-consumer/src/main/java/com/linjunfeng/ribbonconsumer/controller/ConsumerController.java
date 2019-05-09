package com.linjunfeng.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/ribbon")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("helloindex")
    public String helloIndexConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello/index", String.class).getBody();
    }
}
