package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "welcome you!";
    }
}
