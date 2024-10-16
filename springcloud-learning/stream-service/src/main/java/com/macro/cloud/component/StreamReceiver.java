package com.macro.cloud.component;

/**
 * Created by macro on 2023/12/14.
 */

import cn.hutool.json.JSONUtil;
import com.macro.cloud.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

/**
 * @auther macrozheng
 * @description Stream消息接收者
 * @date 2023/12/14
 * @github https://github.com/macrozheng
 */
@Slf4j
@Configuration
public class StreamReceiver {

    @Bean
    public Consumer<String> consumeMsg() {
        return str -> {
            log.info("consumeMsg方法被调用，收到消息：{}" ,str);
        };
    }

    @Bean
    public Consumer<User> consumeUser() {
        return user -> {
            log.info("consumeUser方法被调用，收到消息：{}" , JSONUtil.toJsonStr(user));
        };
    }

    @Bean
    public Consumer<String> consumeConvertMsg() {
        return str -> {
            log.info("consumeConvertMsg方法被调用，收到消息：{}" , str);
        };
    }
}
