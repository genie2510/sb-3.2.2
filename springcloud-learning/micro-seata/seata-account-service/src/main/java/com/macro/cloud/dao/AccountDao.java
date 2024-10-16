package com.macro.cloud.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @auther macrozheng
 * @description 账户管理Dao
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@Repository
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
