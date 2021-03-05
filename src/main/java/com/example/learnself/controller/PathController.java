package com.example.learnself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:
 * Date: 2021/3/4 14:58
 * Author: Mr.Zhao_Nan
 * Version: 1.0
 */

@Controller
public class PathController {

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @GetMapping("/tchSys")
    public String toTchSys(){
        return "teacher/admin";
    }

    @GetMapping("/stuSys")
    public String toStuSys(){
        return "student/index";
    }

    @GetMapping("/admSys")
    public String toAdmSys(){
        return  "admin/index";
    }

    @GetMapping("/stuInfoManage")
    public String stuInfoManage(){
        return "admin/stuUserManage";
    }

    @GetMapping("/tchInfoManage")
    public String tchInfoManage(){
        return "admin/tchInfoManage";
    }
}
