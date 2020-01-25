package org.xichuan.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//@component （把普通pojo实例化到spring容器中，相当于配置文件中的
//<bean id="" class=""/>）
//@ConfigurationProperties，它可以把同类的配置信息自动封装成实体类
//首先在配置文件里面
@Component
@ConfigurationProperties(prefix = "smallbook")
public class Book {
    private String name;
    private String author;
    private Float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
