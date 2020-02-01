package org.xichuan.sendmail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Method3Test {
    @Autowired
    MailServiceMethod3 mailService;
    @Test
    public void sendSimpleMail(){
        mailService.sendMailWithImg("1252546569@qq.com"
        ,"1252546569@qq.com"
        ,"武汉新型肺炎消息"
        ,"<div>hello,这是一封带图片资源的邮件：" +
                        "这是图片1：<div><img src='cid:p01'/></div>" +
                        "这是图片2：<div><img src='cid:p02'/></div>" +
                        "</div>"
       , new String[]{"C:\\Users\\Administrator\\Desktop\\新建文件夹\\aa.jpg",
        "C:\\Users\\Administrator\\Desktop\\新建文件夹\\Inked22_LI.jpg"}
        , new String[]{"p01", "p02"});
    }
}
