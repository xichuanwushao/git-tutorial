package org.xichuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xichuan.entity.Book;

import javax.servlet.http.HttpSession;

@RestController
//http://localhost:8081/chapter02/hello
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/hello2")
    public String hello(HttpSession session) {
       int maxInactiveInterval = session.getMaxInactiveInterval();
       return String.valueOf(maxInactiveInterval);
        //return "hello https!";
    }
//http://localhost:8081/chapter0206/book
    @Autowired
    Book book;
    @GetMapping("/book")
    public String book(){
        return book.toString();

    }
}
