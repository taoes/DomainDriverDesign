package com.zhoutao123.example.domain.domain.model.role;

import java.util.List;

import com.zhoutao123.example.domain.base.id.UserId;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:57
 */
public interface RoleReadService {
    List<Role> findRoleByUserId(UserId userId);
}
