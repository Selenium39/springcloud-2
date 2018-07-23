package com.wantao.eureka.client1.controller;/*
 *author:wantao
 *createTime:18-7-18 12:14
 *description:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping(value="/hello",method=RequestMethod.GET)
    public String hello(){
        return "HelloWorld1";
    }
}

