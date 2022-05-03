package com.springboot.app.repository;

import org.springframework.stereotype.Repository;

import com.springboot.app.entity.BookEntity;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {

}
