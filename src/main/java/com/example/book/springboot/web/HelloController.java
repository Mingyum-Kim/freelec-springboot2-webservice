package com.example.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 반환하는 컨트롤러로 만들어줌
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}