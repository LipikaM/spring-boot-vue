package com.lipika;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/corner")
    public String indexCorner() {
        return "Greetings from Spring Boot Corner!";
    }

}