package com.prerak.Author.controller;

import com.prerak.Author.entity.Author;
import com.prerak.Author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService as;

    @GetMapping("/author")
    public List<Author> getAllAuthor(){
        return as.getAllAuthor();
    }

    @PostMapping("/author")
    public void addAuthor(@RequestBody  Author a){
        as.addAuthor(a);
    }

    @GetMapping("/author/{id}")
    public Author getOne(@PathVariable String id){
        return as.getOne(id);
    }

}
