package com.macro.cloud.controller;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @auther macrozheng
 * @description 账户管理Controller
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping("/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult("扣减账户余额成功！",200);
    }
}
