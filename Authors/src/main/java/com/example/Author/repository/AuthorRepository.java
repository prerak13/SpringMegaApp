package com.example.Author.repository;

import com.example.Author.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class  AuthorRepository {
    List<Author> authors=new ArrayList<>();
    public List<Author> getAllAuthors(){
        return authors;
    }

    public void addAuthor(Author b){
        authors.add(b);
    }

    public Author getOneAuthor(String id){
        Author author = authors.stream().filter(x -> x.id.equals(id)).collect(Collectors.toList()).get(0);
        return author;
    }
}
