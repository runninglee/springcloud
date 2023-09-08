package com.julan.book.controller;



import com.julan.book.service.impl.BooKServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/book")
@RefreshScope
public class BookController {
    @Value(value = "${custom.name}")
    public String name;

    @Resource
    BooKServiceImpl booKService;


    @GetMapping("{id}")
    public Object index(@PathVariable("id") Long id) {
        System.out.println("Book Service 8011 Scope is " + name);
        return booKService.getBookById(id);
    }
}
