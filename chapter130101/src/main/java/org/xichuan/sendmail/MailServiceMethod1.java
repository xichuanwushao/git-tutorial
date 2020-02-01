package org.xichuan.sendmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/***
 * 只发送文字内容
 */
@Component
public class MailServiceMethod1 {
    @Autowired
    JavaMailSender javaMailSender;

    public void sendSimpleMail(String from, String to, String cc, String subject, String content) {
        SimpleMailMessage simpMsg = new SimpleMailMessage();
        simpMsg.setFrom(from);//发送者
        simpMsg.setTo(to);//接收者
        simpMsg.setCc(cc);//抄送人
        simpMsg.setSubject(subject);//邮件主题
        simpMsg.setText(content);//邮件内容
        javaMailSender.send(simpMsg);
    }
}
