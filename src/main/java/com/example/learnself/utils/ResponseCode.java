package com.example.learnself.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Description: 响应消息的响应码
 * Date: 2021/2/26 15:16
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */

@Configuration
@ConfigurationProperties(prefix = "code", ignoreUnknownFields = false)
@PropertySource("classpath:message.properties")
@Data
public class ResponseCode {
    private String SUCCESS;
    private String FAIL;
    private String LOGIN_FAIL_KV;
    private String LOGIN_FAIL_KEY;
    private String LOGIN_FAIL_VALUE;
}
