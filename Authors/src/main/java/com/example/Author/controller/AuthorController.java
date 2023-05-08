package com.example.Author.controller;

import com.example.Author.entity.Author;
import com.example.Author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAllBook(){
        return authorService.getAllAuthor();
    }

    @PostMapping("/author")
    public void addBook(@RequestBody Author a){
        authorService.addAuthor(a);
    }

    @GetMapping("/author/{id}")
    public Author getOne(@PathVariable String id){
        return authorService.getOne(id);
    }
}
