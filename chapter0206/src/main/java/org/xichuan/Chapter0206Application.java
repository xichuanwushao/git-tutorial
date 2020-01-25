package org.xichuan;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Chapter0206Application {

    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(Chapter0206Application.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }

}
