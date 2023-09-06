package com.julan.borrow.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("Book-Service")
public interface BookClient {
    @RequestMapping("/api/book/{id}")
    Object getBookById(@PathVariable("id") long id);
}
