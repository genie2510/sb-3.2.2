package com.macro.cloud.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @auther macrozheng
 * @description 库存管理Dao
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@Repository
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
