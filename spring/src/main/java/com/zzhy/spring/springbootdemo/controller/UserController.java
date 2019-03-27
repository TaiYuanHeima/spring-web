package com.zzhy.spring.springbootdemo.controller;


import com.zzhy.spring.springbootdemo.domin.User;
import com.zzhy.spring.springbootdemo.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/queryUser")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
        return users;
    }
}

