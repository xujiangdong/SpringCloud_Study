package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author XuJD
 * @create 2019-11-28 11:13
 **/
@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String test() {
        return "error";
    }
}
