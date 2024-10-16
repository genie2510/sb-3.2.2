package com.macro.cloud.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

/**
 * @auther macrozheng
 * @description Stream消息生产者
 * @date 2023/12/14
 * @github https://github.com/macrozheng
 */
@Slf4j
@Configuration
public class StreamSender {

//    @Bean
    public Supplier<String> produceMsg() {
        return () -> {
            String message = "hello";
            log.info("produceMsg方法发送了一条消息：{}",message);
            return message;
        };
    }
}
