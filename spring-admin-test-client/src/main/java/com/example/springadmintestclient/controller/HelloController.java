package com.example.springadmintestclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:youzhiming
 * @date: 2021/11/3
 * @description:
 */
@RestController
public class HelloController {
    private AtomicInteger count = new AtomicInteger(0);
    @RequestMapping("/hello")
    public  String hello(){
        //log.info("{} 啪...我第{}次进来了.", LocalDateTime.now(),  count.addAndGet(1));

        // 每次进来new 个大对象，便于监控观察堆内存变化

        byte[] bytes = new byte[100*1024*1024];

       // log.info("new了 100MB");

        return "hi springboot addmin " + LocalDateTime.now();
    }
}
