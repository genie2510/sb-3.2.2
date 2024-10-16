package com.macro.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @auther macrozheng
 * @description MyBatis相关配置
 * @date 2023/12/8
 * @github https://github.com/macrozheng
 */
@Configuration
@MapperScan({"com.macro.cloud.dao"})
public class MyBatisConfig {
}
