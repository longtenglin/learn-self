package com.example.learnself;

import com.example.learnself.utils.ResponseCode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LearnSelfApplicationTests {

    @Resource
    private ResponseCode responseCode;

    @Test
    void contextLoads() {
        System.out.println(responseCode.getSUCCESS());
    }

}
