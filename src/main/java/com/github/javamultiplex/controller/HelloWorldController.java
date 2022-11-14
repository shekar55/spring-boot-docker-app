package com.github.javamultiplex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rohit Agarwal on 14/11/22 11:42 pm
 * @copyright github.com/javamultiplex
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
