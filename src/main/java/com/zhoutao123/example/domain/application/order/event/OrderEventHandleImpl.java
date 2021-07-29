package com.zhoutao123.example.domain.application.order.event;

import com.zhoutao123.example.domain.domain.model.order.OrderService;
import com.zhoutao123.example.domain.domain.model.order.event.AbstractOrderEvent;
import com.zhoutao123.example.domain.domain.model.order.event.OrderEventHandle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
}
