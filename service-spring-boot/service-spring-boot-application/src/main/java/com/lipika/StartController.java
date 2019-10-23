package com.lipika;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StartController {

    @RequestMapping("/")
    public String rootRequest() {
        return "Greetings!! from Spring Boot root path!";
    }


    @RequestMapping("/corner")
    public String cornerRequest() {
        return "Greetings!! from Spring Boot Corner path!";
    }

}