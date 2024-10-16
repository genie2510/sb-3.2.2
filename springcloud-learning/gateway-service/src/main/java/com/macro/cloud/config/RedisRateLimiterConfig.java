package com.macro.cloud.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @auther macrozheng
 * @description 使用Redis实现Gateway限流配置
 * @date 2023/12/1
 * @github https://github.com/macrozheng
 */
@Configuration
public class RedisRateLimiterConfig {

    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
