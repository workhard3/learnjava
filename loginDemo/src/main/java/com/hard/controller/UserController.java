package com.hard.controller;

import com.hard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * About：
 * Date：
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("register")
    public String register(String name,String password){
        return userService.saveUser(name,password);
    }

    @RequestMapping("login")
    public String login(String name,String password){
        return userService.selectUser(name,password);
    }
}
