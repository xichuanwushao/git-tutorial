package org.xichuan;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//http://localhost:8081/chapter040203/zidingyi/p1.png
/**
 * Created by sang on 2018/7/9.
 */
@Configuration
public class MyWebMvcConfig2 implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/zidingyi/**")
                .addResourceLocations("classpath:/zidingyi/");
    }
}
