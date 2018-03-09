package com.hughjwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String args[]) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    String test() {
        return "Hello";
    }

}
