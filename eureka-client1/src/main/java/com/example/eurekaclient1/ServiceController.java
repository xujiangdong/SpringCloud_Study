package com.example.eurekaclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuJD
 * @create 2019-11-22 14:07
 **/
@EnableEurekaClient
@RestController
@RequestMapping("serviceTest")
public class ServiceController {

    @Value("${server.port}")
    public String port;


    @RequestMapping("/test")
    public String test(){
        return "Hello world,this is eureka-client1--"+port;
    }
}
