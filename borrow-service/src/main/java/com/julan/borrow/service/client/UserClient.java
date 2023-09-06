package com.julan.borrow.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("User-Service")
public interface UserClient {
    @RequestMapping("/api/user/{id}")
    Object getUserById(@PathVariable("id") long id);
}
