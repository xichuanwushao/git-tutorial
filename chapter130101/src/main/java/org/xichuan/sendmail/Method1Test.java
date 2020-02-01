package org.xichuan.sendmail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Method1Test {
    @Autowired
    MailServiceMethod1 mailService;
    @Test
    public void sendSimpleMail(){
        mailService.sendSimpleMail("1252546569@qq.com",
                "1252546569@qq.com"
                ,"1252546569@qq.com"
                ,"新型肺炎防止策略"
                ,"少出门，戴口罩");
    }
}
