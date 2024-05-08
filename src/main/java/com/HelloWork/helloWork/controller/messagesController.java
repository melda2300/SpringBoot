package com.HelloWork.helloWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // sınıftaki her yöntemin görünüm yerine bir etki alanı nesnesi döndürdüğü anlamına gelir
@RequestMapping(path = "/Message") // bir web isteğini denetleyici sınıfındaki belirli bir yöntemle eşleyen bir Spring ek açıklamasıdır
public class messagesController {

    //localHost:8080/Message/Mesaj


    @GetMapping(path = "/Mesaj")
    //URL'ye yönelik herhangi bir HTTP GET isteğinin,
    // /Mesajbu ek açıklamayla açıklanan yöntemle ele alınacağı anlamına gelir.
    public String message(@RequestParam String message) {
        return "Your message is: " + message;
    }
}
//@RequestParamServlet istek parametrelerini (yani sorgu parametrelerini veya
// form verilerini) denetleyicideki bir yöntem bağımsız değişkenine bağlamak için kullanılır.
