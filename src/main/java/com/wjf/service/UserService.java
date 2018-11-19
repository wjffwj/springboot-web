package com.wjf.service;

import com.wjf.domain.User;
import com.wjf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User record){
        return  userMapper.login(record);
    }
}
