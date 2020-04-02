package com.rj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: rj
 * @Date: 2020-04-02 01:07
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMain6868 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain6868.class,args);
    }
}
