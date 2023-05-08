package com.prerak.Books;

import com.prerak.Books.entity.Book;
import com.prerak.Books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class BooksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

	@Autowired
	BookRepository br;

	@Value("${books}")
	List<Book> books;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(2);
	}
}
