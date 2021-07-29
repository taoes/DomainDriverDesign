package com.zhoutao123.example.domain.application.order;

import com.zhoutao123.example.domain.domain.model.order.OrderReadService;
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
public class OrderReadServiceImpl implements OrderReadService {

    @Autowired
    private OrderChannel orderChannel;

    @Autowired
    private OrderConverter converter;

}
