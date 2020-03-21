package org.xichuan;

import java.io.Serializable;
import java.util.Date;

/**
 * 所属项目：chapter1201
 * 类名称：Message
 * 类作用：
 * 类作者：Administrator
 * 创建日期：2020/3/21、14:39
 * 审核人：
 * 审核日期：
 * 更新记录：
 * 其它备注：
 */
public class Message implements Serializable {
    private String content;
    private Date date;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
