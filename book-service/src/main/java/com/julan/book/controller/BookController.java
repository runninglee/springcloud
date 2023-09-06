package com.julan.book.controller;

import com.julan.book.service.impl.BooKServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Resource
    BooKServiceImpl booKService;

    @GetMapping("{id}")
    public Object index(@PathVariable("id") Long id) {
        System.out.println("Book Service 8011");
        return booKService.getBookById(id);
    }
}
