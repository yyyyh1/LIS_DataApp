package com.itscreen.dataentryapp.controller;

import com.itscreen.dataentryapp.entity.Result;
import com.itscreen.dataentryapp.entity.User;
import com.itscreen.dataentryapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // get the last record in DB
    @GetMapping("/getData")
    public User queryLastUser(){
        User user = userService.queryLastuser();
        log.info("get the last user in DB", user);
        return user;
    }

    // save user data
    @PostMapping("/add")
    public Result<String> saveUser(String name, Integer age, String title, String hometown){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setTitle(title);
        user.setHometown(hometown);
        userService.save(user);
        return Result.success("ok");
    }

    // delete the last record in DB
    @DeleteMapping("/deleteData")
    public void deleteUser(){
        log.info("delete last data");
        userService.deleteUser();
    }
}
