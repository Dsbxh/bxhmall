package com.bxh.bxhmallmanagerweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BxhmallManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BxhmallManagerWebApplication.class, args);
    }

}
