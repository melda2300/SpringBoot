package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    /*
    Get   : Veri görüntülemek istediğimiz zaman görüntülüyoruz.               = @GetMapping
    Post  : veri kaydetmek istediğimiz zaman kullanıyoruz.                    = @PostMapping
    Put   : Veri güncellemek için kullanıyoruz.                               = @PutMapping
    Patch : Verilerin bir bölümünü güncellemek istediğimiz zaman kullanırız.  =  @PatchMapping
          ÖR: parola güncelemek gibi
   Delete : veri silmek istediğimiz zaman kullanırız.                         =  @DeleteMapping
     */
    // localHost:8080/hello/api

    @GetMapping(path = "/Hello")
    // @RequestMapping(path = "/hello", method = RequestMethod.GET) = üsteki ile aynı işlemi görüyor
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping(path = "view")
    public String view() {
        return "görüntüleme";
    }

    @PostMapping(path = "save")
    public String save() {
        return "Kaydetme";
    }

    @PostMapping(path = "update")
    public String update() {
        return "Güncelleme";
    }

    @PatchMapping(path = "update_a_part")
    public String update_A_Part() {
        return "bir bölümünü güncellemek";
    }

    @DeleteMapping(path = "to_dalete")
    public String to_Delete() {
        return "silmek";
    }


}



