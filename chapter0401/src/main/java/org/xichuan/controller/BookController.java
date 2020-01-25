package org.xichuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.xichuan.entity.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//http://localhost:8081/chapter0301/books
@Controller
public class BookController {
    @GetMapping("/book")
    @ResponseBody//@responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
    // 写入到response对象的body区，通常用来返回JSON数据或者是XML
    public Book book(){
        Book book1 = new Book();
        book1.setAuthor("罗贯中");
        book1.setName("三国演义");
        book1.setPrice(30f);
        book1.setPublicationDate(new Date());
        return book1;
    }


    @GetMapping("/books")
    public ModelAndView books()
    {
        System.out.println(123);
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setPrice(1f);
        book1.setAuthor("罗贯中");
        book1.setName("三国演义");
        Book book2 = new Book();
        book2.setPrice(2f);
        book2.setAuthor("曹雪芹");
        book2.setName("红楼梦");
        books.add(book1);
        books.add(book2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("anyName");
        System.out.println(123);
        return mv;
    }
}
