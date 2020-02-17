package com;

import com.mirson.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.mirson"})
public class GrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcClientApplication.class, args);
    }
    @Autowired
    private GrpcClientService grpcClientService;



    @RequestMapping("/")
    public String getStockPrice(@RequestParam(defaultValue = "中国平安") String name) {
        return grpcClientService.getStockPrice(name);
    }
}
