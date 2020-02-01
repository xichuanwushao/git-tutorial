package org.xichuan;


import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.xichuan.sendmail.MailServiceMethod4;
import org.xichuan.sendmail.User;

import java.io.StringWriter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter1301012ApplicationTests {
    @Autowired
    MailServiceMethod4 mailService;
    @Test
    public void sendHtmlMail2() {
        try {
            Configuration configuration =
                    new Configuration(Configuration.VERSION_2_3_0);
            ClassLoader loader = MailServiceMethod4.class.getClassLoader();
            configuration
            .setClassLoaderForTemplateLoading(loader,"ftl");
            Template template = configuration.getTemplate("mailtemplate.ftl");
            StringWriter mail = new StringWriter();
            User user = new User();
            user.setGender("男");
            user.setUsername("江南一点雨");
            template.process(user, mail);
            mailService.sendHtmlMail("1252546569@qq.com",
                    "avatarwx@163.com",
                    "疫情通报",
                    mail.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
