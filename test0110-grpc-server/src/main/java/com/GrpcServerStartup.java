package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.mirson"})
@SpringBootApplication
public class GrpcServerStartup {

    public static void main(String[] args) {
        SpringApplication.run(GrpcServerStartup.class, args);
    }

}
