package com.example.bookshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class RecentPage {
    @GetMapping("/recent")
    public String getRecentPage(){
        return "recent";
    }

}
