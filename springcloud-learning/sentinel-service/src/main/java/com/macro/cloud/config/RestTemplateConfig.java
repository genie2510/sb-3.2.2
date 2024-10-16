package com.macro.cloud.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther macrozheng
 * @description RestTemplate相关配置
 * @date 2023/12/7
 * @github https://github.com/macrozheng
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    @SentinelRestTemplate
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
