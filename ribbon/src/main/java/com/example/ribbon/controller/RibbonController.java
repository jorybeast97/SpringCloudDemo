package com.example.ribbon.controller;

import com.example.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/test")
    @ResponseBody
    public String getTest() {
        return ribbonService.getServiceByName();
    }

}
