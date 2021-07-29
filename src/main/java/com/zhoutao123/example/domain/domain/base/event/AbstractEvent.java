package com.zhoutao123.example.domain.domain.base.event;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 抽象领域事件
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:12
 */
public abstract class AbstractEvent {

    /**
     * 事件ID
     */
    private String id = UUID.randomUUID().toString();

    /**
     * 事件触发时间
     */
    private LocalDateTime sendTime = LocalDateTime.now();

}
