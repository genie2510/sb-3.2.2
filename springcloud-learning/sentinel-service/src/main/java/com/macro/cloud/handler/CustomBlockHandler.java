package com.macro.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.macro.cloud.domain.CommonResult;

/**
 * @auther macrozheng
 * @description 自定义限流逻辑处理类
 * @date 2023/12/7
 * @github https://github.com/macrozheng
 */
public class CustomBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}
