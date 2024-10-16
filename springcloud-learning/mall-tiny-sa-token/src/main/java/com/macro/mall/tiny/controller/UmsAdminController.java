package com.macro.mall.tiny.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.service.UmsAdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther macrozheng
 * @description 后台用户管理
 * @date 2018/4/26
 * @github https://github.com/macrozheng
 */
@Controller
@Tag(name = "UmsAdminController",description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService adminService;
    @Value("${sa-token.token-prefix}")
    private String tokenHead;

    @Operation(summary = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestParam(name = "username") String username,
                              @RequestParam(name = "password") String password) {
        SaTokenInfo saTokenInfo = adminService.login(username, password);
        if (saTokenInfo == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", saTokenInfo.getTokenValue());
        tokenMap.put("tokenHead", tokenHead+" ");
        return CommonResult.success(tokenMap);
    }

    @Operation(summary = "查询当前登录状态")
    @RequestMapping(value = "/isLogin",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult isLogin() {
        return CommonResult.success(StpUtil.isLogin());
    }
}
