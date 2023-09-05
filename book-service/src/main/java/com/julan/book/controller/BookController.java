package com.julan.book.controller;

import com.julan.common.util.api.ResultJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @GetMapping
    public ResultJson<Object> index(@RequestParam String id) {
        return ResultJson.success("这是BooK Service的请求ID:" + id);
    }
}
