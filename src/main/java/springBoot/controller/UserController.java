package springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springBoot.dto.User;
import springBoot.service.UserService;
import springBoot.service.impl.UserServiceIpml;

@RestController
@RequestMapping(path = "users")
public class UserController {

    @Autowired
    // (@Autowired) = Spring uygulamalarında bağımlılıkları otomatik olarak enjekte
    // etmek için kullanılır ve kodun daha temiz ve esnek olmasını sağlar.
    private UserService userService;


    @GetMapping(path = "/user/{userId}")
    public User getUserById( @PathVariable("userId") Long userId ) {
        return null;
    }
}
