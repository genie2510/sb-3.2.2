package com.macro.cloud.controller;

import cn.hutool.json.JSONUtil;
import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.User;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther macrozheng
 * @description Stream发送消息测试接口
 * @date 2023/12/14
 * @github https://github.com/macrozheng
 */
@Slf4j
@RestController
@RequestMapping("/stream")
public class StreamController {

    @Resource
    private StreamBridge streamBridge;

    @GetMapping("/sendMessage")
    public CommonResult sendMessage(@RequestParam String message) {
        streamBridge.send("consume-msg", message);
        log.info("sendMessage方法发送了一条消息：{}",message);
        return new CommonResult(message,200);
    }

    @GetMapping("/sendUser")
    public CommonResult sendUser() {
        User user = new User(1L,"macro","123456");
        streamBridge.send("consume-user", user);
        log.info("sendUser方法发送了一个对象：{}", JSONUtil.toJsonStr(user));
        return new CommonResult(user,null,200);
    }

    @GetMapping("/sendMessageConvert")
    public CommonResult sendMessageConvert(@RequestParam String message) {
        streamBridge.send("convert-function", message);
        log.info("sendMessageConvert方法发送了一条消息：{}",message);
        return new CommonResult(message,200);
    }
}
