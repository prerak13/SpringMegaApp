package com.prerak.Author.service;

import com.prerak.Author.entity.Author;
import com.prerak.Author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository ar;
    public List<Author> getAllAuthor(){
        return ar.getAllAuthor();
    }

    public void addAuthor(Author a){
        ar.addAuthor(a);
    }

    public Author getOne(String id){
        return ar.getOneAuthor(id);
    }
}
