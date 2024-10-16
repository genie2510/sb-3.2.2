package com.macro.cloud.controller;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.Order;
import com.macro.cloud.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther macrozheng
 * @description 订单管理Controller
 * @date 2023/11/29
 * @github https://github.com/macrozheng
 */
@Tag(name = "OrderController",description = "订单管理")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Operation(summary = "添加订单")
    @PostMapping("/create")
    public CommonResult create(@RequestBody Order order) {
        orderService.create(order);
        return new CommonResult("操作成功", 200);
    }

    @Operation(summary = "根据ID获取订单")
    @GetMapping("/{id}")
    public CommonResult<Order> getUser(@PathVariable Long id) {
        Order order = orderService.getOrder(id);
        return new CommonResult<>(order);
    }

    @Operation(summary = "修改订单")
    @PostMapping("/update")
    public CommonResult update(@RequestBody Order order) {
        orderService.update(order);
        return new CommonResult("操作成功", 200);
    }

    @Operation(summary = "根据ID删除订单")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        orderService.delete(id);
        return new CommonResult("操作成功", 200);
    }
}
