package com.julan.borrow.controller;

import com.julan.borrow.service.impl.BorrowServiceImpl;
import com.julan.common.util.api.ResultJson;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {

    @Resource
    BorrowServiceImpl borrowService;

    @GetMapping("{id}")
    public ResultJson<Object> index(@PathVariable("id") long id) {
        return ResultJson.success(borrowService.getUserBorrowDetailByUid(id));
    }
}
