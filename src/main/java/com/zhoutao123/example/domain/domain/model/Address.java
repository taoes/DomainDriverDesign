package com.zhoutao123.example.domain.domain.model;

import java.util.Objects;

import lombok.Data;

/**
 * 值对象
 *
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-06-10 16:52
 */
@Data
public class Address {

    private String provider;

    private String city;

    private String region;

    private String detail;

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Address address = (Address)o;
        return Objects.equals(provider, address.provider)
            && Objects.equals(city, address.city)
            && Objects.equals(region, address.region)
            && Objects.equals(detail, address.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, city, region, detail);
    }
}
