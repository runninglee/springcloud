package com.julan.borrow.service.impl;

import com.julan.borrow.service.BorrowService;
import com.julan.borrow.service.client.BookClient;
import com.julan.borrow.service.client.UserClient;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RefreshScope
public class BorrowServiceImpl implements BorrowService {

    @Resource
    UserClient userClient;

    @Resource
    BookClient bookClient;

    @Value(value = "${custom.from}")
    public String from;

    @Override
    public Object getUserBorrowDetailByUid(Long uid) {
        HashMap<String, Object> detail = new HashMap<>();
        detail.put("user", userClient.getUserById(uid));
        detail.put("book", bookClient.getBookById(uid));
        detail.put("from", from);
        return detail;
    }
}
