package org.xichuan;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by sang on 2018/7/8.
 */
@Configuration
public class MyWebMvcConfig2 implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        System.out.println("converters.size()>>>"+converters.size());
        converters.clear();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter(gson);
        converters.add(converter);
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = converter.getFastJsonConfig();
//        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
//        fastJsonConfig.setDateFormat("yyyy/MM/dd");
//        converters.add(converter);

    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        com.google.gson.Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter(gson);
        converters.add(converter);
    }
}
