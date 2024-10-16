package com.macro.cloud.controller;

import com.macro.cloud.api.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther macrozheng
 * @description 测试接口
 * @date 2020/6/19
 * @github https://github.com/macrozheng
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public CommonResult hello() {
        return CommonResult.success("Hello World.");
    }

}
