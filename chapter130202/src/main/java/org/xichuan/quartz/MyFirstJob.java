package org.xichuan.quartz;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component(value = "myfirstjob")
public class MyFirstJob {
    public void sayHello(){
        System.out.println("MyFirdtJob:sayHello"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
