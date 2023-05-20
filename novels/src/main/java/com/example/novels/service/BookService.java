package com.example.novels.service;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.json.JSONObject;
import com.example.novels.BookWithAuthorPojo;
import com.example.novels.entity.Book;
import com.example.novels.repository.BookRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository br;

    public List<Book> getAllBook() {
        return br.getAllBooks();
    }

    public void addBook(Book a) {
        br.addBook(a);
    }

    public Book getOne(String id) {
        return br.getOneBook(id);
    }

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "authorFallback")
    public List<BookWithAuthorPojo> bookWithAuthor() throws Exception{

        return br.getAllBooks()
                .stream().map(book -> {
                            String response = restTemplate.getForObject("http://AUTHOR/author/" + book.aid, String.class);
                            JSONObject jsonObj = new JSONObject(response);
                            String authorName = jsonObj.getString("name");
                            return new BookWithAuthorPojo(book.name, authorName);
                        }
                ).toList();
    }

    public List<BookWithAuthorPojo> authorFallback() {
        System.out.println("FALL_BACK");
        var ret=new ArrayList<BookWithAuthorPojo>();
          ret.add(new BookWithAuthorPojo("NA","NA"));
          return ret;
    }


}
