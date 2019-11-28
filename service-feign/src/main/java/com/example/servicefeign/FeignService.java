package com.example.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XuJD
 * @create 2019-11-26 11:13
 **/
@FeignClient(value = "eureka-client1",fallback = FeignServiceHystrix.class)
@Service
public interface FeignService {

    @RequestMapping(value = "/serviceTest/test")
    String test();

}
