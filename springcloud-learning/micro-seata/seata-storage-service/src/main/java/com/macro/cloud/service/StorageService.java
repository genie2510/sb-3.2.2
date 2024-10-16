package com.macro.cloud.service;

/**
 * @auther macrozheng
 * @description 库存管理Service
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
