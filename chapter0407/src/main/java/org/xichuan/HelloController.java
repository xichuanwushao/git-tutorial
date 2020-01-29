package org.xichuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
//http://localhost:8081/chapter02/hello
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }



    @Autowired
    Hello hello;
    @GetMapping("/hello1")
    public String hello1() {
        return hello.sayHello("罗贯中");
    }
    @GetMapping("/hello2")
    public String hello2() {
        return hello.age+"";
    }
    @GetMapping("/hello3")
    public String hello3() {
        return hello.address;
    }
}
