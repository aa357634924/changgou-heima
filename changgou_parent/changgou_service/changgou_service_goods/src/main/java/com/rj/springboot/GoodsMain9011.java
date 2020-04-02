package com.rj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: rj
 * @Date: 2020-04-02 11:30
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.rj.springboot.mapper")
public class GoodsMain9011 {
    public static void main(String[] args) {
        SpringApplication.run(GoodsMain9011.class,args);
    }
}
