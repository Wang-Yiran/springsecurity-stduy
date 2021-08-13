package com.wangyiran.security.springmvc.init;

import com.wangyiran.security.springmvc.config.ApplicationConfig;
import com.wangyiran.security.springmvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @program: spring-security
 * @description:
 * @author: Wang Yiran
 * @create: 2021-08-13 13:07
 **/
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { ApplicationConfig.class };//指定rootContext的配置类
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class }; //指定servletContext的配置类
    }

    @Override
    protected String[] getServletMappings() {
        return new String [] {"/"};
    }
}