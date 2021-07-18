package com.zhoutao123.example.domain.application.user;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.model.user.User;
import com.zhoutao123.example.domain.model.user.UserReadService;
import com.zhoutao123.example.domain.model.user.UserService;
import com.zhoutao123.example.domain.model.user.event.UserEvents;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:12
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    // 领域服务的Service一般依赖于ReadService
    @Autowired
    private UserReadService readService;

    @Autowired
    private UserEvents userEvents;

    @Override
    public void save(User user) {

        // 创建用户

        // 创建完成用户发送UserCreatedEvent
        userEvents.onUserCreate(new UserId());
    }

    @Override
    public void updateUserById(User user) {

        // 创建完成用户发送UserCreatedEvent
        userEvents.onUserUpdated(user.id);
    }

    @Override
    public void disableUser(UserId userId) {

    }
}
