package com.julan.user.service.impl;

import com.julan.user.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RefreshScope
public class UserServiceImpl implements UserService {

    @Value(value = "${custom.education}")
    public String education;

    @Override
    public Object getUserById(Long id) {
        HashMap<String, Object> user = new HashMap<>();
        user.put("id", id);
        user.put("name", "王小虎");
        user.put("sex", "女");
        user.put("birthday", "2000年5月12日");
        user.put("education", education);
        return user;
    }
}
