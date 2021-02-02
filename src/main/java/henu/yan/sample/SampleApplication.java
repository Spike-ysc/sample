package henu.yan.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 项目介绍：Spring Boot基础版本，提供最基本功能，所有新需求在此版本上进行改动
 * 作者：ysc
 * 日期：2021.2.11 16PM
 */
@MapperScan("henu.yan.sample.mapper")   //用于指定mapper文件的路径
@SpringBootApplication
@EnableCaching  //添加Ehcache缓存
public class SampleApplication {

    /**
     * 主函数，程序入口
     * @param args  程序执行输入参数
     */
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}
