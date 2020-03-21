package org.xichuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * 所属项目：chapter1201
 * 类名称：JmsComponent
 * 类作用：
 * 类作者：Administrator
 * 创建日期：2020/3/21、14:40
 * 审核人：
 * 审核日期：
 * 更新记录：
 * 其它备注：
 */
@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate messagingTemplate;
    @Autowired
    Queue queue;
    public void  send(Message message){
        messagingTemplate.convertAndSend(this.queue,message);
    }
    @JmsListener(destination = "amq")
    public  void receive(Message msg){
        System.out.println("receive: "+msg);

    }

}
