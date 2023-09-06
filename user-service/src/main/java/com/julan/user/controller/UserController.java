package com.julan.user.controller;

import com.julan.user.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    UserServiceImpl userService;

    @GetMapping("{id}")
    public Object index(@PathVariable("id") Long id) {
        System.out.println("User Service 8021");
        return userService.getUserById(id);
    }
}
