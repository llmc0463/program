package com.example.springbootimcboot.mapper;

import com.example.springbootimcboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 淡漠
 * @version 1.0
 */
@Mapper
public interface UserMapper {
    void insertUser(User user);
    User getUserByUsername(String username);
}
