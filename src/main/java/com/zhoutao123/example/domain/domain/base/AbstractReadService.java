package com.zhoutao123.example.domain.domain.base;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 抽象的领域聚合根
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 14:18
 */
public interface AbstractReadService<ID extends BaseEntityId, ENTITY extends AbstractDomainEntity<ID>> {

    /**
     * 通过ID查询
     */
    ENTITY getById(ID id);

    /**
     * 通过IDS批量查询
     */
    List<ENTITY> getByIds(Collection<ID> ids);

    /**
     * 通过ID分组查询
     */
    default Map<ID, ENTITY> getAndGroupById(Collection<ID> ids) {
        List<ENTITY> entityList = getByIds(ids);
        return entityList.stream().collect(Collectors.toMap(ENTITY::getId, Function.identity()));
    }
}
