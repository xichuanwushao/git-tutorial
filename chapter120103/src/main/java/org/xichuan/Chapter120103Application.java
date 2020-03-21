package org.xichuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xichuan.send.MessageService;

public class Chapter120103Application {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");

        MessageService messageService = (MessageService) ctx.getBean("messageService");

        messageService.sendQueueMessage("我的测试消息1");

        messageService.sendTopicMessage("我的测试消息2");

        messageService.sendTopicMessage("我的测试消息3");


    }

}
