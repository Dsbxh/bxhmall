package com.bxh.bxhmalluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = ("com.bxh.bxhmalluser.mapper"))
public class BxhmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BxhmallUserServiceApplication.class, args);
    }

}
