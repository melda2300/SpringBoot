package com.HelloWork.helloWork.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Header")
public class HeaderController {


    // localHost:8080/Header/header

    @GetMapping(path = "/header")
    public String getHeader( @RequestHeader("My-Header") String myHeader ){
        return "Your hader is : "+myHeader;
    }
}
// @RequestHeaderBir istek başlığını denetleyicideki bir yöntem
// argümanına bağlamak için kullanılır.