package com.magnoliaory.feign.controller;

import com.magnoliaory.feign.feignInterface.EurekaClientAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {

    @Autowired
    private EurekaClientAPI eurekaClientAPI;

    @GetMapping("/feign")
    @ResponseBody
    public String useFeign() {
        return eurekaClientAPI.useApi();
    }
}
