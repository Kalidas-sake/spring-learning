package com.example.spring.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.main.model.Book;

@RestController
public class BooksController {

	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1l, "Atomic Habits", "Kalidas Sake"));
	}

}
