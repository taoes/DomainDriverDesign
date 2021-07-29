package com.zhoutao123.example.domain.controller;

import java.util.List;

import com.zhoutao123.example.domain.application.user.UserDetail;
import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.AccountContext;
import com.zhoutao123.example.domain.domain.model.permission.Permission;
import com.zhoutao123.example.domain.domain.model.role.Role;
import com.zhoutao123.example.domain.domain.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private AccountContext accountContext;

    @GetMapping("/{userId}")
    public UserDetail findUserById(@PathVariable("userId") UserId userId) {
        User user = accountContext.userReadService().findById(userId);
        List<Role> roles = accountContext.roleReadService().findRoleByUserId(userId);
        List<Permission> permissions = accountContext.permissionReadService().findRoleByUserId(userId);
        return new UserDetail(user, roles, permissions);
    }

    @PutMapping("/{userId}")
    public User create(@RequestBody User user) {
        return accountContext.userService().save(user);
    }
}
