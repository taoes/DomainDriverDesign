package com.zhoutao123.example.domain.domain.model.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.zhoutao123.example.domain.base.id.OrderId;
import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.base.AbstractDomainEntity;
import lombok.Data;

/**
 * 订单领域模型
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:01
 */
@Data
public class Order extends AbstractDomainEntity<OrderId> {

    private String name;

    private LocalDateTime createdAt;

    private BigDecimal price;

    private int count;

    private UserId userId;
}
