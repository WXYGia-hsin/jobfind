package com.wxy.service;

import com.wxy.mapper.UserMapper;
import com.wxy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp {
    @Autowired
    private UserMapper userMapper;
    public User login(String username,String password){
        return  userMapper.login(username,password);
    }
}
