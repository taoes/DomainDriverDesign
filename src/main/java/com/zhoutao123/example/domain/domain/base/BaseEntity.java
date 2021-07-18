package com.zhoutao123.example.domain.domain.base;

/**
 * ID定义
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:19
 */
public interface BaseEntity<ID> {

    /**
     * 返回ID
     */
    ID getId();
}
