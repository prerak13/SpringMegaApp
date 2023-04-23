package com.prerak.Books.controller;

import com.prerak.Books.entity.Book;
import com.prerak.Books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
