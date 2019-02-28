package com.mythghost.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mythghost.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getName")
    public String getName(){
        return userService.getName();
    }
}
