package com.zhoutao123.example.domain.base.id;

import com.zhoutao123.example.domain.domain.base.BaseEntityId;
import lombok.Data;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:36
 */
@Data
public class RoleId implements BaseEntityId {

    @Override
    public Long getId() {
        return null;
    }
}
