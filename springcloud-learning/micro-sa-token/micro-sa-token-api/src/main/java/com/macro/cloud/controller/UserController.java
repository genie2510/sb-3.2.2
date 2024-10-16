package com.macro.cloud.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.macro.cloud.api.CommonResult;
import com.macro.cloud.domain.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther macrozheng
 * @description 获取登录用户信息接口
 * @date 2020/6/19
 * @github https://github.com/macrozheng
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @GetMapping("/info")
    public CommonResult<UserDTO> userInfo() {
        UserDTO userDTO = (UserDTO) StpUtil.getSession().get("userInfo");
        return CommonResult.success(userDTO);
    }

}
