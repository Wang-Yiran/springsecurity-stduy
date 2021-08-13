package com.wangyiran.security.springmvc.service;

import com.wangyiran.security.springmvc.model.AuthenticationRequest;
import com.wangyiran.security.springmvc.model.UserDto;

/**
 * 认证服务
 */
public interface AuthenticationService {

    /**
     * 用户认证
     * @param authenticationRequest 用户认证请求
     * @return 认证成功的用户信息
     */
    UserDto authentication(AuthenticationRequest authenticationRequest);
}