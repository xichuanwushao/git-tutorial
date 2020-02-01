package org.xichuan.chapter130203.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.SimpleTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
/**
 * jobDetail配置方式有两幢  MethodInvokingJobDetailFactoryBean 和  JobDetailFactoryBean
 * Trigger配置方式也有两种  SimpleTriggerFactoryBean 和 CronTriggerFactoryBean
 */
@Configuration
public class QuartzConfig {
    @Bean
    JobDetailFactoryBean jobDetail2(){
        JobDetailFactoryBean bean = new JobDetailFactoryBean();
        bean.setJobClass(MySecondJob.class);
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name","sang");
        bean.setJobDataAsMap(jobDataMap);
        bean.setDurability(true);
        return bean;
    }
   /*
   @Bean //Trigger方法一
     SimpleTriggerFactoryBean simpleTrigger(){
        SimpleTriggerFactoryBean bean = new SimpleTriggerFactoryBean();
        bean.setJobDetail(jobDetail2().getObject());
        bean.setRepeatCount(3);
        bean.setStartDelay(1000);
        bean.setRepeatInterval(2000);
        return bean;
    }
*/
    @Bean/*Trigger方法二*/
    CronTriggerFactoryBean cronTrigger(){
        CronTriggerFactoryBean bean =
                new CronTriggerFactoryBean();
        bean.setJobDetail(jobDetail2().getObject());
        bean.setCronExpression("* * * * * ?");
        return bean;
    }
    @Bean
    SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
      //  SimpleTrigger simpleTrigger = simpleTrigger().getObject();
        CronTrigger cronTrigger =  cronTrigger().getObject();
     //   bean.setTriggers(simpleTrigger);
        bean.setTriggers(cronTrigger);
        return bean;
    }
}
