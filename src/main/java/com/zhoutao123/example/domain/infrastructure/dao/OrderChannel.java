package com.zhoutao123.example.domain.infrastructure.dao;

import com.zhoutao123.example.domain.base.id.OrderId;
import com.zhoutao123.example.domain.domain.model.order.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:47
 */
@Repository
@RequiredArgsConstructor
public class OrderChannel {

    public void save(Order order) {
        System.out.println("OrderChannel.save");
    }

    public void update(Order order) {
        System.out.println("OrderChannel.update");
    }

    public void close(OrderId orderId) {
        System.out.println("OrderChannel.close");
    }
}
