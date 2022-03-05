package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @author jitingyu
 * @CLASS_NAME: Alphaconfig
 * @date 2022/3/4 11:08 上午
 */
@Configuration
//注解@Configuration表示这是个配置类
public class Alphaconfig {
    //要装配第三方Bean时需要注解@Bean
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
