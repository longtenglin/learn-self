package com.example.learnself.utils;
/**
 * Description: 本地日志枚举类
 * Date: 2021/3/3 14:33
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */
public enum LogEnum {

    BUSINESS("business"),

    PLATFORM("platform"),

    DB("db"),

    EXCEPTION("exception");

    private String category;

    LogEnum(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
