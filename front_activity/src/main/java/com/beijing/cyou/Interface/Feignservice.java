package com.beijing.cyou.Interface;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-backend")
public interface Feignservice {


    @RequestMapping(value = "/hello")
    String hello();


    @RequestMapping(value = "/info")
    String info();


}
