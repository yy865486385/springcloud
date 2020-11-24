package com.yangyu.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-10-15
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Provider {

    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/home/{name}")
    public String home(@PathVariable String name) {
        return "hi "+name+",i am provider1 from port:" +port;
    }
}
