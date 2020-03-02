package com.bxh.bxhmallmanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = ("com.bxh.bxhmallmanagerservice.mapper"))
public class BxhmallManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BxhmallManagerServiceApplication.class, args);
    }

}
