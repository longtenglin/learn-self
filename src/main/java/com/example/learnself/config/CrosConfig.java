package com.example.learnself.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description:
 * Date: 2021/3/3 10:07
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {

    static final String[] ORIGINS = new String[] {"GET", "POST", "PUT", "DELETE"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins(ORIGINS)
                .allowedMethods("*").allowCredentials(true).maxAge(3600);
    }
}
