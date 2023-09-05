package com.julan.user.controller;

import com.julan.common.util.api.ResultJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public ResultJson<Object> index() {
        return ResultJson.success("User Service");
    }
}
