package henu.yan.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS 跨域请求处理
 * TODO: 支持的域名暂时做测试用，实际使用中需要更换为前端的地址
 */
@Configuration
public class CorsWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/book/**") //对该格式的请求路径进行跨域请求
                .allowedHeaders("*")    //允许的请求头，默认允许所有
                .allowedMethods("*")    //允许的请求方法，默认是GET、POST和HEAD，*代表支持所有的请求方法
                .maxAge(1800)   //请求的有效期
                .allowedOrigins("http://localhost:8081");   //支持的域
    }
}
