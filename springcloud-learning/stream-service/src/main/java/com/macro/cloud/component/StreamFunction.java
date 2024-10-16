package com.macro.cloud.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @auther macrozheng
 * @description Stream消息转换方法
 * @date 2023/12/15
 * @github https://github.com/macrozheng
 */
@Slf4j
@Configuration
public class StreamFunction {

        @Bean
        public Function<String, String> convertFunction() {
            return message -> {
                log.info("convertFunction方法被执行，message={}",message);
                return message.toUpperCase();
            };
        }

}
