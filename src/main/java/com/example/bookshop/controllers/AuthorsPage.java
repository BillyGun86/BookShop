package com.example.bookshop.controllers;

import com.example.bookshop.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class AuthorsPage {
    private final AuthorService authorService;

    @Autowired
    public AuthorsPage(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String getAuthorsPage(Model model){
        model.addAttribute("authorData",authorService.getAuthorsData());
        return "authors";
    }
}