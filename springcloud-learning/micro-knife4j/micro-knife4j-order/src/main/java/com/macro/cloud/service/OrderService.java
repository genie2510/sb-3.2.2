package com.macro.cloud.service;

import com.macro.cloud.domain.Order;

import java.util.List;

/**
 * @auther macrozheng
 * @description 订单Service
 * @date 2023/11/29
 * @github https://github.com/macrozheng
 */
public interface OrderService {
    void create(Order order);

    Order getOrder(Long id);

    void update(Order order);

    void delete(Long id);
}
