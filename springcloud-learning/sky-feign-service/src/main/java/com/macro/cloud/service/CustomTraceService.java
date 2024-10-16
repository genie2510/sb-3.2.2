package com.macro.cloud.service;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.User;

/**
 * @auther macrozheng
 * @description 自定义链路跟踪Service
 * @date 2024/1/4
 * @github https://github.com/macrozheng
 */
public interface CustomTraceService {

    CommonResult<User> annotation(Long userId);

    CommonResult<User> activeSpan(Long userId);

    CommonResult<User> openTracing(Long userId);
}
