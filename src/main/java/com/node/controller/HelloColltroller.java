package com.node.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloColltroller {
    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
            return "Hello World!";
    }
}
