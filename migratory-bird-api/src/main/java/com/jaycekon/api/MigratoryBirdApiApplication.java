package com.jaycekon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MigratoryBirdApiApplication {

    @RequestMapping(value = "index")
    public String index() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MigratoryBirdApiApplication.class, args);
    }
}
