package com.example.learnself.controller;


import com.example.learnself.entity.EsStudent;
import com.example.learnself.service.IEsStudentService;
import com.example.learnself.service.impl.EsStudentServiceImpl;
import com.example.learnself.utils.LogUtils;
import com.example.learnself.utils.ResponseMap;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mr.ZhaoNan
 * @since 2021-03-04
 */
@RestController
@RequestMapping("/esStudent")
public class EsStudentController {

    @Autowired
    IEsStudentService iEsStudentService;

    private static final Logger logger = LogUtils.getPlatformLogger();

    @RequestMapping("/getStuInfoList")
    public Map<String,Object> getStuInfoList(){
        Map<String, Object> result = new HashMap<>();
        List<EsStudent> studentList = iEsStudentService.list();
        logger.info("getStuInfoList==>student:list: "+studentList.toString());
        if(studentList.size() == 0){
            return ResponseMap.FAILED("");
        }
        result.put("code", 0);
        result.put("message", "");
        result.put("count", studentList.size());
        result.put("data",studentList);
        return ResponseMap.SUCCESS(result);
    }
}
