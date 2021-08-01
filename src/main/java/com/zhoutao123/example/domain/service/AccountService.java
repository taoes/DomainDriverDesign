package com.zhoutao123.example.domain.service;

import com.zhoutao123.example.domain.application.user.UserDetail;
import com.zhoutao123.example.domain.base.id.UserId;

public interface AccountService {

    /**
     * 删除用户
     * @param userId
     */
    void disabled(UserId userId);

    UserDetail findById(UserId userId);

}
