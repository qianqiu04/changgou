package com.guigu.qianqiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication8888 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication8888.class, args);
    }
}
