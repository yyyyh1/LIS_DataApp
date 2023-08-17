package com.itscreen.dataentryapp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itscreen.dataentryapp.entity.User;

public interface UserService {
    User queryLastuser();

    void save(User user);

    void deleteUser();
}
