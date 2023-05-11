package com.example.novels.controller;

import com.example.novels.entity.Book;
import com.example.novels.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @PostMapping("/book")
    public void addBook(@RequestBody Book a){
        bookService.addBook(a);
    }

    @GetMapping("/book/{id}")
    public Book getOne(@PathVariable String id){
        return bookService.getOne(id);
    }
}
