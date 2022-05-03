package com.springboot.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entity.BookEntity;

@RestController
public class BookController {
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public List<BookEntity> checkPage() {
		
		List<BookEntity> bookList = Arrays.asList(
				new BookEntity("Book1", "good book1", 2020, "romance"),
				new BookEntity("Book2", "good book2", 2021, "thriller"),
				new BookEntity("Book3", "good book3", 2022, "horror")
		);
		
		return bookList;
	}
}
