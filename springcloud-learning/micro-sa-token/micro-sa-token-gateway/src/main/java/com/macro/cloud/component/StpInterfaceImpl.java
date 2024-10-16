package com.macro.cloud.component;

import cn.dev33.satoken.stp.StpInterface;
import cn.dev33.satoken.stp.StpUtil;
import com.macro.cloud.domain.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther macrozheng
 * @description 自定义权限验证接口扩展
 * @date 2023/11/28
 * @github https://github.com/macrozheng
 */
@Component
public class StpInterfaceImpl implements StpInterface {

    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        // 返回此 loginId 拥有的权限码列表
        UserDTO userDTO = (UserDTO) StpUtil.getSession().get("userInfo");
        return userDTO.getPermissionList();
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        // 返回此 loginId 拥有的角色码列表
        return null;
    }

}

