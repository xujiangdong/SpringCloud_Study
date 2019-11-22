package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author XuJD
 * @create 2019-11-22 16:02
 **/
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;

    public String testService(){
        return restTemplate.getForObject("http://eureka-client1/serviceTest/test",String.class);
    }
}
