package com.julan.user.controller;

import com.julan.common.util.api.ResultJson;
import com.julan.user.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    UserServiceImpl userService;

    @GetMapping("{id}")
    public ResultJson<Object> index(@PathVariable("id") Long id) {
        return ResultJson.success(userService.getUserById(id));
    }
}
