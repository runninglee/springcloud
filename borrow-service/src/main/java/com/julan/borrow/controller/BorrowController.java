package com.julan.borrow.controller;


import com.julan.common.util.api.ResultJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {

    @GetMapping
    public ResultJson<Object> index() {
        return ResultJson.success();
    }
}
