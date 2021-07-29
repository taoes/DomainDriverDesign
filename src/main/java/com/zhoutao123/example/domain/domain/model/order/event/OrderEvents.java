package com.zhoutao123.example.domain.domain.model.order.event;

import com.zhoutao123.example.domain.base.id.OrderId;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:25
 */
public interface OrderEvents {

    void publish(AbstractOrderEvent event);

    void onOrderCreate(OrderId orderId);

    void onOrderUpdated(OrderId orderId);

    void onOrderPaid(OrderId orderId);

    void onOrderClosed(OrderId orderId);
}
