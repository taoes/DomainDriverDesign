package com.zhoutao123.example.domain.application.order;

import com.zhoutao123.example.domain.domain.model.order.Order;
import com.zhoutao123.example.domain.domain.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderDetail extends Order {

    private User user;

}
