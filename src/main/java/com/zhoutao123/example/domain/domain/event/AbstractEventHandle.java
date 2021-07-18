package com.zhoutao123.example.domain.domain.event;

/**
 * 抽象领域事件处理器
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:13
 */
public interface AbstractEventHandle<T> {

    /**
     * 处理事件
     *
     * @param event
     */
    void handle(T event);
}
