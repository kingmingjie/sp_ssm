package com.sp.share.config;

import com.sp.share.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* webMvc配置类 @Configuration
*
* @author   Watson Wang
* @created  2020/10/27 13:42
**/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
    * 添加拦截器
    *
    * @author   Watson Wang
    * @created  2020/10/27 14:19
    **/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoInterceptor())
                .addPathPatterns("/**");
    }
}
