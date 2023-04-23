package com.prerak.Author.repository;

import com.prerak.Author.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AuthorRepository {

    List<Author> authors=new ArrayList<>();
    public List<Author> getAllAuthor(){
        return authors;
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public Author getOneAuthor(String id){
        return authors.stream().filter(x->x.id.equals(id)).collect(Collectors.toList()).get(0);
    }
}
