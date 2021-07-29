package com.zhoutao123.example.domain.application.user;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.model.user.User;
import com.zhoutao123.example.domain.domain.model.user.UserReadService;
import com.zhoutao123.example.domain.infrastructure.dao.UserChannel;
import com.zhoutao123.example.domain.infrastructure.dao.model.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:12
 */
@Slf4j
@Service
public class UserReadServiceImpl implements UserReadService {

    @Autowired
    private UserChannel userChannel;

    @Autowired
    private UserConverter converter;

    @Override
    public List<User> findUserByAge(Integer age) {
        List<UserDao> userDao = userChannel.findByAge(age);
        return userDao.stream().map(converter::converterFrom).collect(Collectors.toList());
    }

    @Override
    public Integer count(String username) {
        throw new RuntimeException("错误的使用方法");
    }

    @Override
    public User findById(UserId userId) {
        UserDao userDao = userChannel.findById(userId.getId());
        return Optional.ofNullable(userDao).map(converter::converterFrom).orElse(null);
    }

    @Override
    public User getById(UserId id) {
        UserDao userDao = userChannel.findById(id.getId());
        return converter.converterFrom(userDao);
    }

    @Override
    public List<User> getByIds(Collection<UserId> userIds) {
        return null;
    }
}
