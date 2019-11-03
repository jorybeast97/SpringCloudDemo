package com.example.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String getServiceByName() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
