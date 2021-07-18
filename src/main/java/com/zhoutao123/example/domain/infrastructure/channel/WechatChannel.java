package com.zhoutao123.example.domain.infrastructure.channel;

/**
 * 微信相关服务
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:48
 */
public interface WechatChannel {

    /**
     * 发送微信消息
     *
     * @param message
     */
    void sendMessage(String message);

    /**
     * 解析消息
     *
     * @param entryMessage
     */
    String parseMessage(String entryMessage);
}
