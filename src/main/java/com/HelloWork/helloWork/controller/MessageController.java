package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/mesaj")
// @RequestMapping(path = "/mesaj")HTTP isteklerini bir denetleyicideki belirli bir
// yöntemle eşlemek için kullanılır. Bu durumda, URL'ye yapılan herhangi bir HTTP isteğinin,
// /mesaj bu ek açıklamayla açıklanan yöntemle ele alınacağı anlamına gelir.
public class MessageController {

    @GetMapping(path = "message/{message}")
    public String getMyMessage( @PathVariable String message ){
        return "your message is :"+message;
    }
}

// @PathVariableBir URI değişkeninin değerini istek URL'sinden çıkarmak
// ve bunu bir yöntem parametresine bağlamak için kullanılır.
