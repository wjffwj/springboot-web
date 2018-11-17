package com.wjf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "hello")
    public String hello(){
        return "hello,world";
    }
@RequestMapping(value = "success")
    public String Success(){
        return "success";
    }
}
