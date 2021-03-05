package com.example.learnself.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 封装响应消息
 * Date: 2021/2/26 10:35
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */
public class ResponseMap {

    public static Map<String, Object> SUCCESS(){
        Map<String, Object> model = new HashMap<>();
        model.put("statusCode", "SZN0000");
        model.put("message", "SUCCESS");
        model.put("data", null);
        return model;
    }
    public static Map<String, Object> SUCCESS(Object data){
        Map<String, Object> model = new HashMap<>();
        model.put("statusCode",  "SZN0000");
        model.put("message", "SUCCESS");
        model.put("data", data);
        return model;
    }
    public static Map<String, Object> SUCCESS(String msg, Object data){
        Map<String, Object> model = new HashMap<>();
        model.put("statusCode", "SZN0000");
        model.put("message", msg);
        model.put("data", data);
        return model;
    }
    public static Map<String, Object> FAILED(String code){
        Map<String, Object> model = new HashMap<>();
        model.put("statusCode", code);
        model.put("message", "意料之外的错误");
        return model;
    }
    public static Map<String, Object> FAILED(String code, String msg){
        Map<String, Object> model = new HashMap<>();
        model.put("statusCode", code);
        model.put("message", msg);
        return model;
    }
}
