package com.zhoutao123.example.domain.domain.model.order;

import com.zhoutao123.example.domain.base.id.OrderId;

/**
 * 订单写服务
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:26
 */
public interface OrderService {

    void save(Order order);

    void update(Order order);

    void close(OrderId orderId);
}
