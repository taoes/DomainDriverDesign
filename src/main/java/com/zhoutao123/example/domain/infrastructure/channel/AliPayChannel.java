package com.zhoutao123.example.domain.infrastructure.channel;

import java.math.BigDecimal;

/**
 * 微信相关服务
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:48
 */
public interface AliPayChannel {

    /**
     * 发起支付
     *
     * @param message
     */
    String pay(String message, BigDecimal count);

}
