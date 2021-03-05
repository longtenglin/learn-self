package com.example.learnself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.example.learnself.mapper")
public class LearnSelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSelfApplication.class, args);
    }

}
