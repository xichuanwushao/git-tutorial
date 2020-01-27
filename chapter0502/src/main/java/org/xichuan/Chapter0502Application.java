package org.xichuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("org.xichuan.mapper1")
@SpringBootApplication
public class Chapter0502Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter0502Application.class, args);
    }

}
