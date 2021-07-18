package com.zhoutao123.example.domain.model.user;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.zhoutao123.example.domain.base.id.PermissionId;
import com.zhoutao123.example.domain.base.id.RoleId;
import com.zhoutao123.example.domain.base.id.UserId;
import com.zhoutao123.example.domain.domain.base.AbstractDomainEntity;
import com.zhoutao123.example.domain.model.Address;
import com.zhoutao123.example.domain.model.permission.Permission;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * UserModel
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:40
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractDomainEntity<UserId> {

    /**
     * 实体属性
     */
    private String name;

    /**
     * 实体属性
     */
    private Integer age;

    /**
     * 值对象
     */
    private Address address;

    /**
     * 订单数量
     *
     * @apiNote 此参数是为了演示跨域事件，按照真实的业务逻辑，很有有case需要这样配置领域模型
     */
    private Integer orderCount;

    /**
     * 关联的业务对象
     */
    private List<RoleId> roleIds;

    /**
     * 关联的权限ID
     */
    private List<PermissionId> permissionIdList;

}

