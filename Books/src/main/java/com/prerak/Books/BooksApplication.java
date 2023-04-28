package com.prerak.Books;

import com.prerak.Books.entity.Book;
import com.prerak.Books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@
public class BooksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

	@Autowired
	BookRepository br;

	@Override
	public void run(String... args) throws Exception {
		br.addBook(new Book("book1","b1","a1"));
		br.addBook(new Book("book2","b2","a2"));
		br.addBook(new Book("book3","b3","a3"));
	}
}
