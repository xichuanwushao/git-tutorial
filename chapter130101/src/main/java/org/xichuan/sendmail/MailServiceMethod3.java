package org.xichuan.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/***
 * 邮件正文插入图片
 */
@Component
public class MailServiceMethod3 {
    @Autowired
    JavaMailSender javaMailSender;

    public void sendMailWithImg(String from, String to,
                                String subject, String content,
                                String[] srcPath,String[] resIds) {
        if (srcPath.length != resIds.length) {
            System.out.println("发送失败");
            return;
        }
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper =
                    new MimeMessageHelper(message,true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            for (int i = 0; i < srcPath.length; i++) {
                FileSystemResource res =
                        new FileSystemResource(new File(srcPath[i]));
                helper.addInline(resIds[i], res);
            }
            javaMailSender.send(message);
        } catch (MessagingException e) {
            System.out.println("发送失败");
        }
    }
}
