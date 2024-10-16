package com.macro.cloud.domain;

import lombok.*;

import java.util.List;

/**
 * @auther macrozheng
 * @description 用户信息类
 * @date 2020/6/19
 * @github https://github.com/macrozheng
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private List<String> permissionList;
}
