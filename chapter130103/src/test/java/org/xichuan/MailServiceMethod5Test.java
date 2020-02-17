package org.xichuan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xichuan.sendmail.MailServiceMethod5;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceMethod5Test {
    @Autowired
    MailServiceMethod5 mailService;


    @Autowired
    TemplateEngine templateEngine;
    @Test
    public void sendHtmlMailThymeleaf() {
        Context ctx = new Context();
        ctx.setVariable("username", "莱斯莱斯");
        ctx.setVariable("gender", "男");
        String mail = templateEngine.process("mailtemplate.html", ctx);
        mailService.sendHtmlMail("1252546569@qq.com",
                "avatarwx@163.com",
                "疫情通报",
                mail);
    }


}
