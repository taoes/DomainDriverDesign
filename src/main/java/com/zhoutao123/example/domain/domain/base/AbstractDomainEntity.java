package com.zhoutao123.example.domain.domain.base;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 基础的领域实体
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:18
 */
@Data
public abstract class AbstractDomainEntity<ID> implements BaseEntity<ID> {

    public ID id;

    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;
}
