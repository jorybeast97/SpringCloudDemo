package com.magnoliaory.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String di() throws InterruptedException {
        Thread.sleep(5000L);
        String s = "Service" + discoveryClient.getServices();
        System.out.println(s);
        return s;
    }
}
