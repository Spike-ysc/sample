package henu.yan.sample.config;

import henu.yan.sample.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 添加拦截器，可用于拦截未登录情况下的网络请求
 * 为减少提示信息，当前拦截器过滤所有请求，当前拦截器不会拦截任何请求
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //拦截所有请求
                .excludePathPatterns("/**");    //过滤所有请求
    }
}
