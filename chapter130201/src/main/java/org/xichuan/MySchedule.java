package org.xichuan;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MySchedule {
    @Scheduled(fixedDelay = 1000)//系统启动执行1次 间隔1秒执行一次
    public void fixedDelay() {
        System.out.println("fixedDelay:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    @Scheduled(fixedRate = 2000)//系统启动执行1次 间隔2秒执行一次
    public void fixedRate() {
        System.out.println("fixedRate:"+new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    @Scheduled(initialDelay = 1000,fixedRate = 2000)//系统启动执行1次 间隔2秒执行一次
    public void initialDelay() {
        System.out.println("initialDelay:"+new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    @Scheduled(cron = "0 * * * * ?")
    public void cron() {
        System.out.println("cron:"+new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
