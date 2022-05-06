package com.springboot.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.entity.BookEntity;
import com.springboot.app.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public BookEntity posting(BookEntity book) {
		
		BookEntity savedBook = bookRepo.save(book);
		
		return savedBook;
	}
	
	public List<BookEntity> gettingAll(){

		return (List<BookEntity>) bookRepo.findAll();
	}
	
	public BookEntity gettingInfo(int key) {
		
		return bookRepo.findById(key).orElse(new BookEntity());
		
	}
	
	public BookEntity deleting(BookEntity book){
		
		bookRepo.deleteById(book.getBookId());
		
		return book;
	}
	
}
