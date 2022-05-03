package com.springboot.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookEntity {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String description;
	private Integer yearOfPublication;
	private String bookType;
	
	public BookEntity(Integer bookId, String bookName, String description, Integer yearOfPublication, String bookType) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.description = description;
		this.yearOfPublication = yearOfPublication;
		this.bookType = bookType;
	}
	public BookEntity(String bookName, String description, Integer yearOfPublication, String bookType) {
		super();
		this.bookName = bookName;
		this.description = description;
		this.yearOfPublication = yearOfPublication;
		this.bookType = bookType;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(Integer yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
