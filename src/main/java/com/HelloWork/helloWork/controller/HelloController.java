package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // localHost:8080/hello
    @GetMapping(path = "/Hello")
    public  String sayHello(){
        return "Hello world";
    }
}



