package com.macro.cloud.service;


import com.macro.cloud.domain.Order;

/**
 * @auther macrozheng
 * @description 订单管理Service
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
