package com.wantao.feign.consumer.service;

import com.wantao.hello.service.api.service.RefactoryHelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@FeignClient("hello-service")  //在创建Feign Client的同时也创建了Ribbon Client
@Service
public interface FeignRefactorHelloService extends RefactoryHelloService {
}
