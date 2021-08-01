package com.zhoutao123.example.domain.application.user;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.model.user.User;
import com.zhoutao123.example.domain.domain.model.user.UserReadService;
import com.zhoutao123.example.domain.domain.model.user.UserService;
import com.zhoutao123.example.domain.domain.model.user.event.UserEvents;
import com.zhoutao123.example.domain.infrastructure.dao.UserChannel;
import com.zhoutao123.example.domain.infrastructure.dao.model.UserDao;
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

    @Autowired
    private UserChannel channel;

    @Autowired
    private UserConverter converter;

    @Override
    public User save(User user) {

        // 创建用户
        UserDao userDao = channel.save(converter.converterTo(user));

        // 创建完成用户发送UserCreatedEvent
        userEvents.onUserCreated(new UserId());

        //GraphQL

        return converter.converterFrom(userDao);
    }

    @Override
    public void updateUserById(User user) {
        User u = readService.findById(user.id);
        if (u == null) {
            throw new RuntimeException("用户不允许更新");
        }

        // 创建完成用户发送UserCreatedEvent
        userEvents.onUserUpdated(user.id);
    }

    @Override
    public void disableUser(UserId userId) {
        channel.disabled(userId);
        // 发送完成用户禁用的命令
        userEvents.onUserDisabled(userId);
    }

    @Override
    public void updateOrderCount(UserId userId) {
        // 首先查询用户
        User user = readService.findById(userId);
        user.setOrderCount(user.getOrderCount() + 1);
        this.save(user);

        // 发送用户更新事件
        userEvents.onUserUpdated(userId);
    }
}
