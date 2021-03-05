package com.example.learnself.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Description: 本地日志参考类
 * Date: 2021/3/3 14:33
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */
public class LogUtils {

    /**
     *  获取业务日志 Logger
     * @return Logger
     */
    public static Logger getBusinessLogger(){
        return LoggerFactory.getLogger(LogEnum.BUSINESS.getCategory());
    }

    /**
     *  获取平台日志 Logger
     * @return Logger
     */
    public static Logger getPlatformLogger(){
        return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
    }

    /**
     *  获取数据库日志 Logger
     * @return Logger
     */
    public static Logger getDBLogger(){
        return LoggerFactory.getLogger(LogEnum.DB.getCategory());
    }

    /**
     * 获取异常日志 Logger
     * @return Logger
     */
    public static Logger getExceptionLogger(){
        return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
    }
}
