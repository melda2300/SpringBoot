package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/mesaj")
public class MessageController {

    @GetMapping(path = "message/{message}")
    public String getMyMessage( @PathVariable String message ){
        return "your message is :"+message;
    }
}
