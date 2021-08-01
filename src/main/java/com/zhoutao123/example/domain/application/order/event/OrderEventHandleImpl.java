package com.zhoutao123.example.domain.application.order.event;

import com.zhoutao123.example.domain.domain.model.order.OrderService;
import com.zhoutao123.example.domain.domain.model.order.event.AbstractOrderEvent;
import com.zhoutao123.example.domain.domain.model.order.event.OrderEventHandle;
import com.zhoutao123.example.domain.domain.model.user.event.AbstractUserEvent;
import com.zhoutao123.example.domain.domain.model.user.event.UserDisabledEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:16
 */
@Slf4j
@Service
public class OrderEventHandleImpl implements OrderEventHandle {

    @Autowired
    private OrderService orderService;

    @Override
    public void handle(AbstractOrderEvent event) {
        // 派发事件
    }

    @Override
    public void onCreate(AbstractOrderEvent event) {

    }

    @Override
    public void onUpdate(AbstractOrderEvent event) {

    }


    @EventListener(AbstractUserEvent.class)
    public void handle(AbstractUserEvent event) {
        if (event instanceof UserDisabledEvent) {
            // 订单域接收到用户被禁用事件，需要处理

        }
    }
}
