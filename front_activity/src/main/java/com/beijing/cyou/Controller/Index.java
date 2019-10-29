package com.beijing.cyou.Controller;

import com.beijing.cyou.Interface.Feignservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {


    @Autowired
    Feignservice feignservice;



    @RequestMapping("/hello")
    public String hello(){
        return  feignservice.hello();
    }

    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    public String info(){
        return feignservice.info();
    }

}
