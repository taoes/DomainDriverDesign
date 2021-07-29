package com.zhoutao123.example.domain.domain.model.permission;

/**
 * @author 须诚 taozhou.tao@alibaba-inc.com
 * @date 2021-07-18 22:58
 */
public interface PermissionService {

    // 检查是否有权限
    boolean checkPermission(CharSequence permission_name);
}
