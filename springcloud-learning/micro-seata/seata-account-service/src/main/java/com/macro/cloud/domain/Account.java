package com.macro.cloud.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @auther macrozheng
 * @description 账户管理实体类
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@Data
public class Account {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
