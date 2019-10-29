package com.beijing.cyou.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/info")
    public String info(){
        return "服务的配置端口是："+port;
    }



    @RequestMapping
    public  String hello(){
        return  "hello";
    }
}
