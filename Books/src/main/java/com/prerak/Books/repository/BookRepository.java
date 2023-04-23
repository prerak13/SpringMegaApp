package com.prerak.Books.repository;

import com.prerak.Books.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository {
    List<Book> books=new ArrayList<>();
    public List<Book> getAllBooks(){
        return books;
    }

    public void addBook(Book b){
        books.add(b);
    }

    public Book getOneBook(String id){
        Book book = books.stream().filter(x -> x.id.equals(id)).collect(Collectors.toList()).get(0);
        return book;
    }
}
