package com.example.Author;

import com.example.Author.entity.Author;
import com.example.Author.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AuthorApplication implements CommandLineRunner {
	@Autowired
	AuthorRepository ar;


	public static void main(String[] args) {
		SpringApplication.run(AuthorApplication.class, args);
	}

	@Value("${author-test}")
	String test;

	@Value("${authors}")
	Object authors;
	@Override
	public void run(String... args) throws Exception {
		ar.addAuthor( new Author("A1","1") );
		ar.addAuthor( new Author("A2","2") );
		ar.addAuthor( new Author("A3","3") );
		System.out.println(test);
	}
}
