package com.zhoutao123.example.domain.domain.base;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 23:36
 */
public interface BaseConverter<DAO, MO> {

    DAO converterTo(MO model);

    MO converterFrom(DAO dao);
}
