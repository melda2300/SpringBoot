package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    // localHost:8080/hello/api

     @GetMapping(path = "/Hello")
    // @RequestMapping(path = "/hello", method = RequestMethod.GET) = üsteki ile aynı işlemi görüyor
    public String sayHello() {
        return "Hello world";
    }
}



