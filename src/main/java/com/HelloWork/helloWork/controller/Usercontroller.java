package com.HelloWork.helloWork.controller;


import com.HelloWork.helloWork.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")

// localHost:8080/user/users

public class Usercontroller {
    @PostMapping(path = "users")
    public User saveUser(@RequestBody User user ) {
        System.out.println(" user saved! ");
        user.setPasswork("");
        return user;
    }
    @PostMapping(path = "users-all")
    public List<User> saveAlUser( @RequestBody  List<User>  users ) {
        System.out.println(" user saved! ");
        users.forEach(user -> user.setPasswork(""));
        return users;
    }
}
