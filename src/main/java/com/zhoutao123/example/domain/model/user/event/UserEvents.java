package com.zhoutao123.example.domain.model.user.event;

import com.zhoutao123.example.domain.base.id.UserId;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:25
 */
public interface UserEvents {

    void publish(AbstractUserEvent event);

    void onUserCreate(UserId userId);

    void onUserUpdated(UserId userId);
}
