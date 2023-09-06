package com.julan.user.service.impl;

import com.julan.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Object getUserById(Long id) {
        HashMap<String, Object> user = new HashMap<>();
        user.put("id", id);
        user.put("name", "王小虎");
        user.put("sex", "女");
        user.put("birthday", "2000年5月12日");
        return user;
    }
}
