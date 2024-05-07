package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mesaj")
public class MessageController {

    @GetMapping(path = "message/{message}")
    public String getMyMessage( @PathVariable String message ){
        return "your message is :"+message;
    }
}
