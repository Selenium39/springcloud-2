package com.wantao.feign.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud2FeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2FeignConsumerApplication.class, args);
    }
}
