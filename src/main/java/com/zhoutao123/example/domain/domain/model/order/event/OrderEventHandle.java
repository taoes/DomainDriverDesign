package com.zhoutao123.example.domain.domain.model.order.event;

import com.zhoutao123.example.domain.domain.base.event.AbstractEventHandle;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:14
 */

public interface OrderEventHandle extends AbstractEventHandle<AbstractOrderEvent> {

    void onCreate(AbstractOrderEvent event);

    void onUpdate(AbstractOrderEvent event);
}
