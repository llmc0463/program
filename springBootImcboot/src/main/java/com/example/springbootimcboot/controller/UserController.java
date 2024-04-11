package com.example.springbootimcboot.controller;


import com.example.springbootimcboot.bean.Msg;
import com.example.springbootimcboot.bean.User;
import com.example.springbootimcboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 淡漠
 * @version 1.0
 */
@Controller
@RequestMapping("/ibs/user")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ResponseBody
    @CrossOrigin
    public Msg register(@RequestBody User user) {
        userService.register(user);
        // 返回响应信息
        return Msg.success();
    }

    @PostMapping("/login")
    @ResponseBody
    @CrossOrigin
    public Msg login(@RequestBody User user) {
        User dbUser = userService.validateLogin(user.getUsername(), user.getPassword());
        // 根据dbUser判断登录是否成功并返回响应信息
        if (dbUser != null) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

}
