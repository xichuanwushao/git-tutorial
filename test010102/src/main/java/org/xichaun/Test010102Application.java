package org.xichaun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.xichaun.config.LogPower;
import org.xichaun.config.StaticMethod;

@SpringBootApplication
public class Test010102Application implements CommandLineRunner {
    @Autowired
    @Qualifier("getlogpower")
    LogPower getlogpower;

    public static void main(String[] args) {

        SpringApplication.run(Test010102Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ExcelUtil.getPath());
        System.out.println(ExcelUtil.getHour());
//        getlogpower.print("aaaaaaaaaaaaaaaaaa");
//        LogPower logPower =StaticMethod.getBean(LogPower.class);
//        logPower.print("sssssssssssssssss");
//        ThreadUtil.sleep(111);
    }
}
