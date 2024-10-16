package com.macro.mall.tiny.service;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.macro.mall.tiny.domain.AdminUser;

/**
 * @auther macrozheng
 * @description 后台用户管理Service
 * @date 2020/10/15
 * @github https://github.com/macrozheng
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUser getAdminByUsername(String username);

    /**
     * 根据用户ID获取用户
     */
    AdminUser getAdminById(Long id);

    /**
     * 用户名密码登录
     */
    SaTokenInfo login(String username, String password);
}
