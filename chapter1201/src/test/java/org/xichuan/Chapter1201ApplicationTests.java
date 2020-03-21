package org.xichuan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Chapter1201ApplicationTests {


    @Autowired
    JmsComponent jmsComponent;

    @Autowired
    ReceiveBody receiveBody;
    @Test
    public  void contextLoads(){
        Message msg = new Message();
        msg.setContent("Hello Jms");
        msg.setDate(new Date());
        jmsComponent.send(msg);
       // receiveBody.send(msg);
    }
}
