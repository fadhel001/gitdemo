package com.fadhel;

import com.fadhel.entities.Book;
import com.fadhel.entities.BookCategory;
import com.fadhel.repository.BookCategoryRepository;
import com.fadhel.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
import java.util.*;

@SpringBootApplication
public class GitdemoApplication implements CommandLineRunner {
	@Autowired
	private   BookCategoryRepository bookCatRepo;

	@Autowired
	private   BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);System.out.print("hello world");

	}

	@Override
	public void run(String... strings) throws Exception {
/*
		List<Book> books = new ArrayList<>();
		BookCategory category =  new BookCategory();
		category.setCategoryName("Web developement");
		category.setBook(books);
		Book book1 = new Book(null,"300-c","PHP & MySQL","language",new BigDecimal(600.00),"/resources/images/img7.jpg", true, 21, new Date(), new Date(),category);
		Book book2= new Book(null,"300-c","c++ programming","language",new BigDecimal(500.00),"/resources/images/img8.jpg", true, 28, new Date(), new Date(),category);
		Book book3 = new Book(null,"300-c","Spring Framework","language",new BigDecimal(900.00),"/resources/images/img9.jpg", true, 12, new Date(), new Date(),category);
		category.getBook().add(book1);
		category.getBook().add(book2);
		category.getBook().add(book3);
		this.bookCatRepo.save(category);*/
    }
}
