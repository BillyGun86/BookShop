package com.example.bookshop.service;

import com.example.bookshop.data.Author;
import com.example.bookshop.data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Service
public class AuthorService {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAuthorsData(){

        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors", (ResultSet rs, int rownum)->{
            Author author=new Author();
            author.setId(rs.getInt("id"));
            author.setUserName(rs.getString("userName"));
            return author;
        });
        return new ArrayList<>(authors);
    }
}