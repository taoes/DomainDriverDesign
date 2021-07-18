package com.zhoutao123.example.domain.model.user.event;

import com.zhoutao123.example.domain.domain.event.AbstractEventHandle;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:14
 */

public interface UserEventHandle extends AbstractEventHandle<AbstractUserEvent> {

    void onUserCreated(UserCreatedEvent event);

    void onUserUpdated(UserUpdatedEvent event);
}
