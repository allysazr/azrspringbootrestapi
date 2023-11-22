package com.juaracoding.azrspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author Allysa Zahra Ramadhina
Java Developer
Created on 22/11/2023 19:52
@Last Modified 22/11/2023 19:52
Version 1.0
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")//untuk log (filter)
public class CobaController {

    @GetMapping("/v1/welcome")
    public String welcome () {

        System.out.println("Masuk Kesini");
        return "Hello World!!";
    }

    @GetMapping("/v1/save")
    public String save(){

        System.out.println("Save Disini");
        return "Sudah Tersimpan";
    }

    @GetMapping("/v1/update")
    public String update(){

        System.out.println("Update Disini");
        return "Sudah Terubah";
    }

    @GetMapping("/v1/delete")
    public String delete(){

        System.out.println("Hapus Disini");
        return "Sudah Terhapus";
    }

    @GetMapping("/v1/find")
    public String findBy(){

        System.out.println("Temukan Disini");
        return "Sudah Ditemukan";
    }
}
