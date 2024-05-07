package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(path = "ileti")
public class MessagesController {

    //localHost:8080/ileti/mesaj

    /**
     * Retrieves a message.
     *
     * @param message the message to retrieve
     * @return the retrieved message
     */
    @GetMapping(path = "/Mesaj")
    public String getMessage(@RequestParam String message) {
        if (message == null || message.isEmpty()) {
            return "Error: Message cannot be empty.";
        }
        return "Your message is: " + message;
    }
}
