package com.wantao.feign.consumer.controller;/*
 *author:wantao
 *createTime:18-7-22 10:30
 *description:
 */

import com.wantao.feign.consumer.bean.User;
import com.wantao.feign.consumer.service.FeignRefactorHelloService;
import com.wantao.feign.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @Autowired
    FeignRefactorHelloService feignRefactorHelloService;
    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String feignConsumer() {
        return helloService.hello();
    }
    @RequestMapping(value="/feign-consumer1",method = RequestMethod.GET)
    public String feignConsumer1(){
        StringBuilder sb=new StringBuilder();
        sb.append(helloService.hello1("wantao")).append("\n");
        sb.append(helloService.hello2("wantao",20)).append("\n");
        sb.append(helloService.hello3(new User("wantao",30))).append("\n");
        return sb.toString();
    }
    @RequestMapping(value="/feign-consumer2",method=RequestMethod.GET)
    public String feignConsumer2(){
        return feignRefactorHelloService.hello4("wantao");
    }
}
