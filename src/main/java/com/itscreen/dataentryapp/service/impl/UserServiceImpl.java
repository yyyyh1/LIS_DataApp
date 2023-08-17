package com.itscreen.dataentryapp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itscreen.dataentryapp.entity.User;
import com.itscreen.dataentryapp.mapper.UserMapper;
import com.itscreen.dataentryapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryLastuser() {
        return userMapper.queryLastUser();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void deleteUser() {
        userMapper.deleteUser();
    }
}
