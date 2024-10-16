package com.macro.mall.tiny.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @auther macrozheng
 * @description 用户相关角色
 * @date 2023/11/28
 * @github https://github.com/macrozheng
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class AdminRole {
    private Long id;
    private String name;
    private List<String> permissionList;
}
