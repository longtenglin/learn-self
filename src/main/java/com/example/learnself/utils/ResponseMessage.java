package com.example.learnself.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description: 读取自定义 properties 文件
 * Date: 2021/2/26 10:58
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "message", ignoreUnknownFields = false)
@PropertySource("classpath:message.properties")
@Data
public class ResponseMessage {
    private String SUCCESS;
    private String FAIL;
    private String LOGIN_FAIL_KV;
    private String LOGIN_FAIL_KEY;
    private String LOGIN_FAIL_VALUE;
}
