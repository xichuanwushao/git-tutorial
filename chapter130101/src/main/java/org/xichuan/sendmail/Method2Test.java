package org.xichuan.sendmail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Method2Test {
    @Autowired
    MailServiceMethod2 mailService;
    @Test
    public void sendSimpleMail(){
        mailService.sendAttachFileMail("1252546569@qq.com"
                , "1252546569@qq.com"
                ,"新型肺炎防治策略"
                ,"戴口罩,少出门"
                ,new File("C:\\Users\\Administrator\\Desktop\\新建文件夹\\music包问题.docx"));
    }
}
