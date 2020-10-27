package com.sp.share.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* 拦截器示例
*
* @author   Watson Wang
* @created  2020/10/27 13:53
**/
@Slf4j
public class DemoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 拦截器的前置处理，起到是否通过的作用
        log.info(" -------------------- DemoInterceptor preHandle -------------------- ");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView)
            throws Exception {
        // 拦截器的请求处理，在preHandle通过后，对请求进行处理
        log.info(" -------------------- DemoInterceptor postHandle ------------------- ");
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex)
            throws Exception {
        // 拦截器的后置处理，在方法执行完毕后，进行收尾
        log.info(" -------------------- DemoInterceptor afterCompletion -------------- ");
    }
}
