package com.example.bookshop.controllers;

import com.example.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class MainPage {
    private final BookService bookService;

    @Autowired
    public MainPage(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/main")
    public String getMainPage(Model model){
        model.addAttribute("bookData",bookService.getBooksData());
        return "index";
    }
}