package org.xichaun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name = "getlogpower")
    public LogPower getLogPower() {
        LogPower logPower = new LogPower();
        return logPower;
    }


}
