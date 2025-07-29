package com.example.mywork1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userauth")
public class Controllers {

    @GetMapping
    public String getdata() {
        return "hello";
    }
    
}