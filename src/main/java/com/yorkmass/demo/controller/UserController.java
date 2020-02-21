package com.yorkmass.demo.controller;

import com.yorkmass.demo.model.User;
import com.yorkmass.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("{id}")
    @ResponseBody
    public User userinfo(@PathVariable() Integer id){
        User user=new User("gyf","123");
        user.setId(id);
        return user;
    }

    @Autowired
    private IUserService userService;

    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("find")
    @ResponseBody
    public User find(String username){
        return userService.findByUsername(username);
    }


}
