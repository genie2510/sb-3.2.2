package com.macro.cloud.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import com.macro.cloud.api.CommonResult;
import com.macro.cloud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther macrozheng
 * @description 自定义Oauth2获取令牌接口
 * @date 2020/7/17
 * @github https://github.com/macrozheng
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Value("${sa-token.token-prefix}")
    private String tokenHead;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestParam String username, @RequestParam String password) {
        SaTokenInfo saTokenInfo = userService.login(username, password);
        if (saTokenInfo == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", saTokenInfo.getTokenValue());
        tokenMap.put("tokenHead", tokenHead+" ");
        return CommonResult.success(tokenMap);
    }
}
