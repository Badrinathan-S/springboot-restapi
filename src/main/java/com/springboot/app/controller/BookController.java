package com.springboot.app.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entity.BookEntity;
import com.springboot.app.service.BookService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

	@Autowired
	BookService bookServ;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public List<BookEntity> checkPage() {

		return bookServ.gettingAll();
	}

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public BookEntity postBook(@RequestBody BookEntity book) {

		return bookServ.posting(book);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public BookEntity updateBook(@RequestBody BookEntity book) {

		return bookServ.posting(book);
	}

	@DeleteMapping("/remove")
	public BookEntity deleteBook(@RequestBody BookEntity book) {

		return bookServ.deleting(book);
	}
	
	
	@GetMapping("/{key}")
	public BookEntity getBook(@PathVariable("key") int key) {
		
		return bookServ.gettingInfo(key);
		
	}

}
