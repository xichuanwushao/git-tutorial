package org.xichuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
//http://localhost:8081/chapter02/hello
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
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
}
