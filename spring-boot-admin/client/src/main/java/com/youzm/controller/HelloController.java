package com.youzm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:youzhiming
 * @date: 2021/11/4
 * @description:
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        byte[] bytes = new byte[100*1024*1024];
        return "hello World";
    }
}
