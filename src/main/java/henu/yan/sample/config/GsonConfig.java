package henu.yan.sample.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import java.lang.reflect.Modifier;

/**
 * Gson自定义类
 * Spring Boot提供Gson的自动转换类，但想对日期进行格式化，还需要自定义HttpMessageConverter
 */
@Configuration
public class GsonConfig {

    //处理Gson返回日期的格式
    @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("yyyy-MM-dd");
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
        Gson gson = builder.create();
        converter.setGson(gson);
        return converter;
    }
}
