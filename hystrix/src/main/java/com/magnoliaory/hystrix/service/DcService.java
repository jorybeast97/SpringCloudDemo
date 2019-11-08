package com.magnoliaory.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DcService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String getMessage() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String fallBack() {
        return "熔断机制生效,fall back";
    }
}
