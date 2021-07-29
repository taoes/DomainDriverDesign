package com.zhoutao123.example.domain.application.order;

import com.zhoutao123.example.domain.domain.base.BaseConverter;
import com.zhoutao123.example.domain.domain.model.order.Order;
import com.zhoutao123.example.domain.infrastructure.dao.model.OrderDao;
import org.springframework.stereotype.Component;

/**
 * 订单转换服务，暂未实现
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:38
 */
@Component
public class OrderConverter implements BaseConverter<OrderDao, Order> {

    @Override
    public OrderDao converterTo(Order model) {
        return null;
    }

    @Override
    public Order converterFrom(OrderDao orderDao) {
        return null;
    }
}
