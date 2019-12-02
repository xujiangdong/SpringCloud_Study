package com.example.configclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuJD
 * @create 2019-11-28 17:21
 **/
@RestController
@RefreshScope
public class TestController {

    @Value("${db.url}")
    private String url;

    @RequestMapping("getConfig")
    public String getConfig(){
        return url;
    }
}
