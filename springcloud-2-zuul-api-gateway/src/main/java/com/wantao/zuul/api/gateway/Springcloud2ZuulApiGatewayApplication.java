package com.wantao.zuul.api.gateway;

import com.wantao.zuul.api.gateway.util.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class Springcloud2ZuulApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2ZuulApiGatewayApplication.class, args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

}
