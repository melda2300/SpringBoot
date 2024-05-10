package com.HelloWork.helloWork.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
localHost:8080/MyController/first-class

localHost:8080/MyController/second-class

 */

@RestController
@RequestMapping(path = "/MyController")
public class MyController {
    @Autowired
    private FirstClass firstClass;
    @Autowired
    private SecondClass secondClass;

    @GetMapping(path = "/first-class")
    public String getNameOfFirstClass() {
        return firstClass.getName();
    }

    @GetMapping(path = "/second-class")
    public String getNameOfSecondClass() {
        return secondClass.getName();
    }
}
