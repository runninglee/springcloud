package com.julan.book.controller;

import com.julan.book.service.impl.BooKServiceImpl;
import com.julan.common.util.api.ResultJson;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Resource
    BooKServiceImpl booKService;

    @GetMapping("{id}")
    public ResultJson<Object> index(@PathVariable("id") Long id) {
        return ResultJson.success(booKService.getBookById(id));
    }
}
