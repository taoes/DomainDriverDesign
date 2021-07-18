package com.zhoutao123.example.domain.model.user;

import java.util.Collection;
import java.util.List;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.model.Address;

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
    void save(User user);

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
}
