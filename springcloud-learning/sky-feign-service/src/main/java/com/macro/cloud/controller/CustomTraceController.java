package com.macro.cloud.controller;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.User;
import com.macro.cloud.service.CustomTraceService;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther macrozheng
 * @description 自定义链路跟踪测试Controller
 * @date 2024/1/4
 * @github https://github.com/macrozheng
 */
@RestController
@RequestMapping("/trace")
public class CustomTraceController {

    @Autowired
    private CustomTraceService customTraceService;

    @GetMapping("/annotation")
    public CommonResult<User> annotation(@RequestParam Long userId) {
        return customTraceService.annotation(userId);
    }

    @GetMapping("/activeSpan")
    public CommonResult<User> activeSpan(@RequestParam Long userId) {
        return customTraceService.activeSpan(userId);
    }

    @GetMapping("/openTracing")
    public CommonResult<User> openTracing(@RequestParam Long userId) {
        return customTraceService.openTracing(userId);
    }
}
