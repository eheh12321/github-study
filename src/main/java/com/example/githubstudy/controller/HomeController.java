package com.example.githubstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String index() {
        System.out.println("Feat/1 기능 추가");
        return "To-do Application!";
    }
}
