package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuJD
 * @create 2019-11-26 11:13
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/hello")
    public String test(){
        return feignService.test();
    }
}
