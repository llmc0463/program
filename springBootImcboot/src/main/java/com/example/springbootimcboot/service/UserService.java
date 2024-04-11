package com.example.springbootimcboot.service;


import com.example.springbootimcboot.bean.User;

/**
 * @author 淡漠
 * @version 1.0
 */
public interface UserService {
    void register(User user);
    User validateLogin(String username, String password);
}
