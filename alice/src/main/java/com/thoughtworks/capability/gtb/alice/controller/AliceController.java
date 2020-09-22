package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {
    @GetMapping(path = "/hello")
    public String hello(){
        String requestBobUrl = "http://localhost:8081/hello";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(requestBobUrl, String.class);
    }
}
