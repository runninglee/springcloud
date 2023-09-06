package com.julan.book.service.impl;

import com.julan.book.service.BookService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BooKServiceImpl implements BookService {
    @Override
    public Object getBookById(Long id) {
        HashMap<String, Object> book = new HashMap<>();
        book.put("id", id);
        book.put("name", "遥远的救世主");
        book.put("author", "豆豆");
        book.put("published_at", "2005年5月");
        return book;
    }
}
