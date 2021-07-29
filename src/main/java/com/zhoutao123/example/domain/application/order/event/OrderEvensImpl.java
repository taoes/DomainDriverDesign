package com.zhoutao123.example.domain.application.order.event;

import com.zhoutao123.example.domain.base.id.OrderId;
import com.zhoutao123.example.domain.domain.model.order.event.AbstractOrderEvent;
import com.zhoutao123.example.domain.domain.model.order.event.OrderClosedEvent;
import com.zhoutao123.example.domain.domain.model.order.event.OrderCreatedEvent;
import com.zhoutao123.example.domain.domain.model.order.event.OrderEvents;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderEvensImpl implements OrderEvents {
    @Override
    public void publish(AbstractOrderEvent event) {

    }

    @Override
    public void onOrderCreate(OrderId orderId) {
        this.publish(new OrderCreatedEvent());
    }

    @Override
    public void onOrderUpdated(OrderId orderId) {
        // 发送已支付事件
    }

    @Override
    public void onOrderPaid(OrderId orderId) {
        // 发送已支付事件
    }

    @Override
    public void onOrderClosed(OrderId orderId) {
        this.publish(new OrderClosedEvent());
    }
}
