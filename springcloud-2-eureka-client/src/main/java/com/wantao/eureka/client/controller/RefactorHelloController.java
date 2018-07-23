package com.wantao.eureka.client.controller;/*
 *author:wantao
 *createTime:18-7-22 12:45
 *description:
 */

import com.wantao.hello.service.api.service.RefactoryHelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorHelloController implements RefactoryHelloService {
    @Override
    public String hello4(String name) {
        return "hello"+name;
    }
}
