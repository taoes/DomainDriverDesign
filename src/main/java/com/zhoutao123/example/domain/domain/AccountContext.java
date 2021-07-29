package com.zhoutao123.example.domain.domain;

import com.zhoutao123.example.domain.domain.base.AbstractDomainContext;
import com.zhoutao123.example.domain.domain.model.permission.PermissionReadService;
import com.zhoutao123.example.domain.domain.model.permission.PermissionService;
import com.zhoutao123.example.domain.domain.model.role.RoleReadService;
import com.zhoutao123.example.domain.domain.model.role.RoleService;
import com.zhoutao123.example.domain.domain.model.user.UserReadService;
import com.zhoutao123.example.domain.domain.model.user.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 账户域
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:23
 */
@Data
@Component
@Accessors(fluent = true)
@AllArgsConstructor(onConstructor_ = {@Lazy})
public class AccountContext implements AbstractDomainContext {

    private UserReadService userReadService;

    private UserService userService;

    private RoleService roleService;

    private RoleReadService roleReadService;

    private PermissionService permissionService;

    private PermissionReadService permissionReadService;

}
