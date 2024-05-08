package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Message")
public class messagesController {

    //localHost:8080/Message/Mesaj


    @GetMapping(path = "/Mesaj")
    public String message(@RequestParam String message) {
        return "Your message is: " + message;
    }
}
