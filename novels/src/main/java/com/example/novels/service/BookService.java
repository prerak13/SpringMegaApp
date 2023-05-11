package com.example.novels.service;


import com.example.novels.entity.Book;
import com.example.novels.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository br;
    public List<Book> getAllBook(){
        return br.getAllBooks();
    }

    public void addBook(Book a){
        br.addBook(a);
    }

    public Book getOne(String id){
        return br.getOneBook(id);
    }
}
