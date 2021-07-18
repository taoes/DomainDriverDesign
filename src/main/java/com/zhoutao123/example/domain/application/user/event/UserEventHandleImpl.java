package com.zhoutao123.example.domain.application.user.event;

import com.zhoutao123.example.domain.model.user.event.AbstractUserEvent;
import com.zhoutao123.example.domain.model.user.event.UserCreatedEvent;
import com.zhoutao123.example.domain.model.user.event.UserEventHandle;
import com.zhoutao123.example.domain.model.user.event.UserUpdatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:16
 */
@Slf4j
@Service
public class UserEventHandleImpl implements UserEventHandle {

    @Override
    public void onUserCreated(UserCreatedEvent event) {
        log.info("接收到用户创建消息");
    }

    @Override
    public void onUserUpdated(UserUpdatedEvent event) {
        log.info("接收到用户更新消息");
    }

    @Override
    @EventListener(AbstractUserEvent.class)
    public void handle(AbstractUserEvent event) {
        if (event instanceof UserCreatedEvent) {
            this.onUserCreated((UserCreatedEvent)event);
        }

        if (event instanceof UserUpdatedEvent) {
            this.onUserUpdated((UserUpdatedEvent)event);
        }

    }

}
