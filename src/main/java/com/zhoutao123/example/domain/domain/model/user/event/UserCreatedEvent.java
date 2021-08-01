package com.zhoutao123.example.domain.domain.model.user.event;

import com.zhoutao123.example.domain.base.id.UserId;

/**
 * 用户被创建事件
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:04
 */
public class UserCreatedEvent extends AbstractUserEvent {

    private UserId userId;


}
