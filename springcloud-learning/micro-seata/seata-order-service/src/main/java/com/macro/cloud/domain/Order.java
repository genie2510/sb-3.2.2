package com.macro.cloud.domain;


import lombok.Data;

import java.math.BigDecimal;

/**
 * @auther macrozheng
 * @description 订单实体类
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@Data
public class Order {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;

}
