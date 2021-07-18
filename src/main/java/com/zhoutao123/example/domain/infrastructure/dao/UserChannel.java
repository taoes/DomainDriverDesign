package com.zhoutao123.example.domain.infrastructure.dao;

import java.util.Collections;
import java.util.List;

import com.zhoutao123.example.domain.infrastructure.dao.mapping.UserMapping;
import com.zhoutao123.example.domain.infrastructure.dao.model.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:47
 */
@Component
@RequiredArgsConstructor
public class UserChannel {

    private final UserMapping userMapping;

    public UserDao findById(Long id) {
        return null;
    }

    public List<UserDao> findByAge(int age) {
        return Collections.emptyList();
    }

}
