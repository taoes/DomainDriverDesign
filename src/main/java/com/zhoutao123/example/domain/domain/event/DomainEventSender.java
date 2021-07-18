package com.zhoutao123.example.domain.domain.event;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:13
 */
public interface DomainEventSender {

    void publish(AbstractEvent event);
}
