package org.xichuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xichuan.props.User;
import org.xichuan.props.Users;

import javax.servlet.http.HttpSession;
import java.awt.print.Book;

@RestController
//http://localhost:8081/chapter02/hello
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot!";
    }
    @Autowired
    User user;
    @Autowired
    Users users;
    @GetMapping("/user")
    public String book() {
        return user.toString();
    }
    @GetMapping("/users")
    public String books() {
        return users.toString();
    }
}
