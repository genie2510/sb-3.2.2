package com.macro.mall.tiny.component;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.exception.NotRoleException;
import com.macro.mall.tiny.common.api.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther macrozheng
 * @description 全局异常处理
 * @date 2020/2/27
 * @github https://github.com/macrozheng
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理未登录的异常
     */
    @ResponseBody
    @ExceptionHandler(value = NotLoginException.class)
    public CommonResult handleNotLoginException(NotLoginException e) {
        return CommonResult.unauthorized(e.getMessage());
    }

    /**
     * 处理没有权限的异常
     */
    @ResponseBody
    @ExceptionHandler(value = NotPermissionException.class)
    public CommonResult handleNotPermissionException(NotPermissionException e) {
        return CommonResult.forbidden(e.getMessage());
    }

    /**
     * 处理没有角色的异常
     */
    @ResponseBody
    @ExceptionHandler(value = NotRoleException.class)
    public CommonResult handleNotRoleException(NotRoleException e) {
        return CommonResult.forbidden(e.getMessage());
    }
}
