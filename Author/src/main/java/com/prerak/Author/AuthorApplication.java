package com.prerak.Author;

import com.prerak.Author.entity.Author;
import com.prerak.Author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AuthorApplication.class, args);
	}

	@Autowired
	AuthorRepository ar;
	@Override
	public void run(String... args) throws Exception {
		ar.addAuthor(new Author("author1","a1"));
		ar.addAuthor(new Author("author2","a2"));
		ar.addAuthor(new Author("author3","a3"));
	}
}
