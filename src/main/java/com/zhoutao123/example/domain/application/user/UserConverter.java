package com.zhoutao123.example.domain.application.user;

import com.zhoutao123.example.domain.domain.base.BaseConverter;
import com.zhoutao123.example.domain.infrastructure.dao.model.UserDao;
import com.zhoutao123.example.domain.domain.model.user.User;
import org.springframework.stereotype.Component;

/**
 * User转换服务，暂未实现
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:38
 */
@Component
public class UserConverter implements BaseConverter<UserDao, User> {
    @Override
    public UserDao converterTo(User model) {
        return null;
    }

    @Override
    public User converterFrom(UserDao userDao) {
        return null;
    }
}
