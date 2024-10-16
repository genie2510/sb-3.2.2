package com.macro.cloud.controller;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.Order;
import com.macro.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther macrozheng
 * @description 订单管理Controller
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult("订单创建成功!", 200);
    }
}
