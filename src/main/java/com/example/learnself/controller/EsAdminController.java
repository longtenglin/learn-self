package com.example.learnself.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learnself.entity.EsAdmin;
import com.example.learnself.service.IEsAdminService;
import com.example.learnself.utils.LogUtils;
import com.example.learnself.utils.ResponseCode;
import com.example.learnself.utils.ResponseMap;
import com.example.learnself.utils.ResponseMessage;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mr.ZhaoNan
 * @since 2021-03-04
 */
@Controller
@RequestMapping("/esAdmin")
public class EsAdminController {

    @Autowired
    private IEsAdminService iUserService;

    @Resource
    private ResponseCode responseCode;

    @Resource
    private ResponseMessage responseMessage;

    private static final Logger businessLogger = LogUtils.getBusinessLogger();
    private static final Logger logger = LogUtils.getPlatformLogger();

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(@RequestBody EsAdmin user, HttpServletRequest request, HttpServletResponse response) {
        logger.info("login function start");
        logger.info("user: " + user.toString());
        EsAdmin isUser = iUserService.getOne(new QueryWrapper<EsAdmin>().eq("user_id", user.getUserId()));
        Map<String,Object> resultMap = new HashMap<>();
        if (isUser == null) {
            logger.info("login is failed");
            return ResponseMap.FAILED(responseCode.getLOGIN_FAIL_KV(), responseMessage.getLOGIN_FAIL_KV());
        }
        resultMap.put("esRoles", isUser.getRoles());
        return ResponseMap.SUCCESS(resultMap);
    }
}
