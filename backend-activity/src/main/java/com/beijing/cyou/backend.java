package com.beijing.cyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class backend
{
    public static void main( String[] args )
    {
        SpringApplication.run(backend.class,args);
    }
}
