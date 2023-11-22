package com.juaracoding.azrspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author Allysa Zahra Ramadhina
Java Developer
Created on 22/11/2023 20:25
@Last Modified 22/11/2023 20:25
Version 1.0
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forconsumer")
public class PublicController {

    @GetMapping("/v1/blog")
    public String blog () {

        System.out.println("Masuk Kesini");
        return "Hello World!!";
    }
}
