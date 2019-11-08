package com.magnoliaory.hystrix.controller;

import com.magnoliaory.hystrix.service.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DcController {

    @Autowired
    private DcService dcService;

    @GetMapping("/dc")
    @ResponseBody
    public String getMessage() {
        return dcService.getMessage();
    }

}
