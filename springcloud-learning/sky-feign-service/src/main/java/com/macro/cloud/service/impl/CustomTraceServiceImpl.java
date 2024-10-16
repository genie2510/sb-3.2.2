package com.macro.cloud.service.impl;

import cn.hutool.core.thread.ThreadUtil;
import com.alibaba.nacos.common.utils.ThreadUtils;
import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.User;
import com.macro.cloud.service.CustomTraceService;
import com.macro.cloud.service.UserService;
import io.opentracing.Span;
import io.opentracing.Tracer;
import org.apache.skywalking.apm.toolkit.opentracing.SkywalkingTracer;
import org.apache.skywalking.apm.toolkit.trace.ActiveSpan;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther macrozheng
 * @description 自定义链接跟踪Service实现类
 * @date 2024/1/4
 * @github https://github.com/macrozheng
 */
@Service
public class CustomTraceServiceImpl implements CustomTraceService {

    @Autowired
    private UserService userService;

    @Trace
    @Tag(key = "userId", value = "arg[0]")//arg[0]为固定写法
    @Tag(key = "result.id", value = "returnedObj.data.id")//returnedObj为固定写法
    @Tag(key = "result.username", value = "returnedObj.data.username")
    @Override
    public CommonResult<User> annotation(Long userId) {
        return userService.getUser(userId);
    }

    @Override
    public CommonResult<User> activeSpan(Long userId) {
        ActiveSpan.debug("activeSpan debug message...");
        ActiveSpan.info("activeSpan info message...");
        ActiveSpan.error("activeSpan error message...");
        return userService.getUser(userId);
    }

    @Override
    public CommonResult<User> openTracing(Long userId) {
        //模拟一个耗时操作
        ThreadUtil.safeSleep(1000);
        //只监控startManual和finish之间的代码片段
        Tracer tracer = new SkywalkingTracer();
        Tracer.SpanBuilder spanBuilder = tracer.buildSpan("/trace-span/openTracing");
        Span span = spanBuilder.withTag("tag", "openTracing").startManual();
        CommonResult<User> result = userService.getUser(userId);
        span.finish();
        return result;
    }
}
