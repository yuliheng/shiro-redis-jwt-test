package com.ylh.execute.controller;

import com.ylh.execute.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylh
 * @version 1.0
 * @date 2021/5/8 14:35
 */
@RestController
@RequestMapping("/test_controller")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/test")
    public String query() {
        String result = testService.quertTest();
        System.out.println("===========result:"+result);
        return result;
    }
}
