package com.wantao.hello.service.api.service;

import com.wantao.hello.service.api.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
public interface RefactoryHelloService {
    @RequestMapping(value="/hello4",method=RequestMethod.GET)
    String hello4(@RequestParam("name") String name);
}
