package com.yangyu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-10-15
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
