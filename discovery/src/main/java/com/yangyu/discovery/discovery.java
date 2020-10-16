package com.yangyu.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-10-15
 */
@SpringBootApplication
@EnableEurekaServer
public class discovery {
    public static void main(String[] args) {
        SpringApplication.run(discovery.class, args);
    }
}
