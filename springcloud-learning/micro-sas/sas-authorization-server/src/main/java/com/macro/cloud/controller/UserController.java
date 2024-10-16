package com.macro.cloud.controller;

import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

/**
 * @auther macrozheng
 * @description 用户信息管理Controller
 * @date 2023/12/22
 * @github https://github.com/macrozheng
 */
@Controller
public class UserController {

    @ResponseBody
    @GetMapping("/user")
    public Map<String,Object> user(Principal principal) {
        if (!(principal instanceof JwtAuthenticationToken token)) {
            return Collections.emptyMap();
        }
        return token.getToken().getClaims();
    }
}
