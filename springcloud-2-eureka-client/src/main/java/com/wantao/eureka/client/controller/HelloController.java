package com.wantao.eureka.client.controller;/*
 *author:wantao
 *createTime:18-7-18 12:12
 *description:
 */

import com.wantao.eureka.client.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "HelloWorld";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam("name") String name) {
        return "Hello" + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello2(@RequestHeader("name") String name, @RequestHeader Integer age) {
        return new User(name, age);

    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody User user) {  //这里要求User必须有无参构造方法,不然JSON字符串转化为User对象会报错
        return "Hello" + user.getName() + "," + user.getAge();
    }
}
