package com.example.springbootimcboot.service.impl;

import com.example.springbootimcboot.bean.User;
import com.example.springbootimcboot.mapper.UserMapper;
import com.example.springbootimcboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 淡漠
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void register(User user) {
        userMapper.insertUser(user);
    }

    public User validateLogin(String username, String password) {
        return userMapper.getUserByUsername(username);
    }
}
