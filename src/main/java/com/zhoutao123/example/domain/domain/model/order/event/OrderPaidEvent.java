package com.zhoutao123.example.domain.domain.model.order.event;

import com.zhoutao123.example.domain.base.id.UserId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单已支付事件
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderPaidEvent extends AbstractOrderEvent {

    private UserId userId;
}
