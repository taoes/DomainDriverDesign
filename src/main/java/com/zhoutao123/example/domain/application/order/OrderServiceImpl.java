package com.zhoutao123.example.domain.application.order;

import com.zhoutao123.example.domain.base.id.OrderId;
import com.zhoutao123.example.domain.domain.AccountContext;
import com.zhoutao123.example.domain.domain.model.order.Order;
import com.zhoutao123.example.domain.domain.model.order.OrderReadService;
import com.zhoutao123.example.domain.domain.model.order.OrderService;
import com.zhoutao123.example.domain.domain.model.order.event.OrderEvents;
import com.zhoutao123.example.domain.infrastructure.dao.OrderChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:12
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    // 领域服务的Service一般依赖于ReadService
    @Autowired
    private OrderReadService readService;

    @Autowired
    private OrderEvents orderEvents;

    @Autowired
    private OrderChannel channel;

    @Autowired
    private OrderConverter converter;

    @Autowired
    private AccountContext accountContext;

    @Override
    public void save(Order order) {
        channel.save(order);

        // 发送事件
        orderEvents.onOrderCreate(order.id);
    }

    @Override
    public void update(Order order) {
        boolean hasPermission = accountContext.permissionService().checkPermission("PERMISSION_NAME");
        if (!hasPermission) {
            throw new RuntimeException();
        }

        channel.update(order);

        // 发送领域事件
        orderEvents.onOrderUpdated(order.id);

        // 如果订单已支付，则发送订单已支付事件
        orderEvents.onOrderPaid(order.id);
    }

    @Override
    public void close(OrderId orderId) {
        channel.close(orderId);
        // 发送关闭的领域事件
        orderEvents.onOrderClosed(orderId);
    }
}
