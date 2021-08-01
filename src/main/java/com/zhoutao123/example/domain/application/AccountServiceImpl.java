package com.zhoutao123.example.domain.application;

import java.util.List;

import com.zhoutao123.example.domain.application.user.UserDetail;
import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.AccountContext;
import com.zhoutao123.example.domain.domain.model.permission.Permission;
import com.zhoutao123.example.domain.domain.model.role.Role;
import com.zhoutao123.example.domain.domain.model.user.User;
import com.zhoutao123.example.domain.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountContext accountContext;

    @Override
    public void disabled(UserId userId) {
        User user = accountContext.userReadService().findById(userId);
        //校验xxx

        //禁用用户，禁用用户相关的影响，通过 '禁用用户事件' 引发
        accountContext.userService().disableUser(userId);
    }

    @Override
    public UserDetail findById(UserId userId) {
        User user = accountContext.userReadService().findById(userId);
        List<Role> roles = accountContext.roleReadService().findRoleByUserId(userId);
        List<Permission> permissions = accountContext.permissionReadService().findRoleByUserId(userId);
        return new UserDetail(user, roles, permissions);
    }
}
