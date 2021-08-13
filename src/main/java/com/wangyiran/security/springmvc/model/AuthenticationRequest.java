package com.wangyiran.security.springmvc.model;

import lombok.Data;

/**
 * @program: spring-security
 * @description:
 * @author: Wang Yiran
 * @create: 2021-08-13 13:21
 **/
@Data
public class AuthenticationRequest {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;


}