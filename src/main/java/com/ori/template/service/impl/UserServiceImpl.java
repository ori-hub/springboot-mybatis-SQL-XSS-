package com.ori.template.service.impl;

import com.ori.template.domain.User;
import com.ori.template.mapper.UserMapper;
import com.ori.template.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList(){

        List<User> list = userMapper.queryUserList();
        return list;
    }
}
