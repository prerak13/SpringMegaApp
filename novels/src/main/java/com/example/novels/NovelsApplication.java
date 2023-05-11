package com.example.novels;

import com.example.novels.entity.Book;
import com.example.novels.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovelsApplication  implements CommandLineRunner {

	@Autowired
	BookRepository br;

	@Value("${book-test}")
	String bt;

	public static void main(String[] args) {
		SpringApplication.run(NovelsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		br.addBook(new Book("b1","b1","a1"));
		br.addBook(new Book("b2","b2","a2"));
		br.addBook(new Book("b3","b3","a3"));
		System.out.println(bt);
	}
}
