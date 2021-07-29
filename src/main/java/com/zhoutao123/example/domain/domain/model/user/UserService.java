package com.zhoutao123.example.domain.domain.model.user;

import com.zhoutao123.example.domain.base.id.UserId;

/**
 * 用户服务
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:25
 */
public interface UserService {

    /**
     * 保存用户
     *
     * @param user
     */
    User save(User user);

    /**
     * 更新用户
     *
     * @param user
     */
    void updateUserById(User user);

    /**
     * 禁用用户
     *
     * @param userId
     */
    void disableUser(UserId userId);

    /**
     * 更新用户订单数
     *
     * @param userId
     */
    void updateOrderCount(UserId userId);
}
