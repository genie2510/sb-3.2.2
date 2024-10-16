package com.macro.cloud.service;

import java.math.BigDecimal;

/**
 * @auther macrozheng
 * @description 账户管理Service
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);
}
