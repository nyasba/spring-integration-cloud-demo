package com.nyasba.hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/")
    public String demo() {
        return "demo application is started!!";
    }
}
