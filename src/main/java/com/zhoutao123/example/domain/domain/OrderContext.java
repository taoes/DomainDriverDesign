package com.zhoutao123.example.domain.domain;

import com.zhoutao123.example.domain.domain.base.AbstractDomainContext;
import com.zhoutao123.example.domain.domain.model.order.OrderReadService;
import com.zhoutao123.example.domain.domain.model.order.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 订单域
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:23
 */
@Data
@Component
@Accessors(fluent = true)
@AllArgsConstructor(onConstructor_ = {@Lazy})
public class OrderContext implements AbstractDomainContext {

    // 订单的读
    @Autowired
    private OrderReadService orderReadService;

    // 订单的写
    @Autowired
    private OrderService orderService;


}
