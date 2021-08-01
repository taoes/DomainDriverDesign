package com.zhoutao123.example.domain.controller;

import com.zhoutao123.example.domain.application.user.UserDetail;
import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{userId}")
    public UserDetail findUserById(@PathVariable("userId") UserId userId) {
        // 校验
        return accountService.findById(userId);
    }

    @DeleteMapping("/{userId}")
    public void remove(@PathVariable UserId userId) {
         accountService.disabled(userId);
    }
}
