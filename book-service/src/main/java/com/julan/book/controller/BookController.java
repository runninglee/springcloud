package com.julan.book.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.julan.book.service.impl.BooKServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @NacosValue("${custom.name}")
    private String name;

    @Resource
    BooKServiceImpl booKService;

    @GetMapping("{id}")
    public Object index(@PathVariable("id") Long id) {
        System.out.println("Book Service 8011 Scope is " + name);
        return booKService.getBookById(id);
    }
}
