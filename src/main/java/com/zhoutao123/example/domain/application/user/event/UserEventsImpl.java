package com.zhoutao123.example.domain.application.user.event;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.model.user.event.AbstractUserEvent;
import com.zhoutao123.example.domain.domain.model.user.event.UserCreatedEvent;
import com.zhoutao123.example.domain.domain.model.user.event.UserDisabledEvent;
import com.zhoutao123.example.domain.domain.model.user.event.UserEvents;
import com.zhoutao123.example.domain.domain.model.user.event.UserUpdatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 事件发送实现，根据自己的业务需求可以实现一个事务内的或者异步的等等
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:25
 */
@Slf4j
@Component
public class UserEventsImpl implements UserEvents, ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void publish(AbstractUserEvent event) {
        context.publishEvent(event);
    }

    @Override
    public void onUserCreated(UserId userId) {
        // TODO 填充事件信息
        UserCreatedEvent userCreatedEvent = new UserCreatedEvent();
        publish(userCreatedEvent);
    }

    @Override
    public void onUserUpdated(UserId userId) {
        // TODO 填充事件信息
        publish(new UserUpdatedEvent());
    }

    @Override
    public void onUserDisabled(UserId userId) {
        // 填充数据
        publish(new UserDisabledEvent());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

}
