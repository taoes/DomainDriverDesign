package com.zhoutao123.example.domain.application.user;

import java.util.List;

import com.zhoutao123.example.domain.domain.model.permission.Permission;
import com.zhoutao123.example.domain.domain.model.role.Role;
import com.zhoutao123.example.domain.domain.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDetail extends User {

    /**
     * 关联的业务对象
     */
    private List<Role> roles;

    /**
     * 关联的权限ID
     */
    private List<Permission> permissions;

    public UserDetail(User user, List<Role> roles, List<Permission> permissions) {
        BeanUtils.copyProperties(user, this);
        this.roles = roles;
        this.permissions = permissions;
    }
}
