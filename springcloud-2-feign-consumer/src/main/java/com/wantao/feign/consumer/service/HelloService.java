package com.wantao.feign.consumer.service;

import com.wantao.feign.consumer.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service") //绑定服务名,不区分大小写
@Service
public interface HelloService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name); //一定要指明参数的值,springmvc不指明会用参数名作默认值,Feign不会

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello3(@RequestBody User user);//这里要求User必须有无参构造方法,不然JSON字符串转化为User对象会报
}
