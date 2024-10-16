package com.macro.mall.tiny.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @auther macrozheng
 * @description 登录用户
 * @date 2023/11/28
 * @github https://github.com/macrozheng
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class AdminUser {
    private Long id;
    private String username;
    private String password;
    private Long roleId;
    private AdminRole role;
}
