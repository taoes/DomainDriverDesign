package com.zhoutao123.example.domain.model.user.event;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.event.AbstractEvent;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:03
 */
public abstract class AbstractUserEvent extends AbstractEvent {

    private UserId userId;
}
