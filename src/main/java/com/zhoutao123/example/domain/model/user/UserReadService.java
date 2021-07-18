package com.zhoutao123.example.domain.model.user;

import java.util.List;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.base.AbstractReadService;

/**
 * 用户服务
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:25
 */
public interface UserReadService extends AbstractReadService<UserId, User> {

    /**
     * 查询用户
     */
    List<User> findUserByAge(Integer age);

    /**
     * 查询用户数量
     *
     * @apiNote 此方法为错误示例
     */
    @Deprecated
    Integer count(String username);
}


