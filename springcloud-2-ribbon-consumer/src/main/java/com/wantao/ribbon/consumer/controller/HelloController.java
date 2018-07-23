package com.wantao.ribbon.consumer.controller;/*
 *author:wantao
 *createTime:18-7-18 12:07
 *description:
 */

import com.wantao.ribbon.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/ribbon-consumer")
    public String hello() {
        return helloService.helloService();

    }
}
