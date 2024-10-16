package com.macro.cloud.dao;

import com.macro.cloud.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @auther macrozheng
 * @description 订单管理Dao
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@Repository
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
