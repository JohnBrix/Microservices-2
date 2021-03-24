package com.example.microservices_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/getHello")
    public String hello() {

        return "Hello World";
    }

    @GetMapping("/getName")
    public String getName() {

        return "Hello John Brix Pomoy";
    }

}
