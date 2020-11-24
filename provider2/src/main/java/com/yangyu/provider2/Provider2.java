package com.yangyu.provider2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @date 2020/11/24
 * @Author yangyu
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
@RequestMapping("/s2")
public class Provider2 {

    public static void main(String[] args) {
        SpringApplication.run(Provider2.class, args);
    }

    @Value("${server.port}")
    String port;

    @Autowired
    private Provider1Client provider1Client;

    @RequestMapping("/home/{name}")
    public String home(@PathVariable("name") String name) {
        return "hi "+name+",i am provider2 from port:" +port;
    }

    @GetMapping("/provider1")
    public String provider1(String name){
        return provider1Client.hello("测试");
    }

    @FeignClient(name = "provider1")
    @RequestMapping("s1")
    interface Provider1Client {

        @RequestMapping("/home/{name}")
        String hello(@PathVariable("name") String name);
    }

}
