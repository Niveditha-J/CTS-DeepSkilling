package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void getAllBooks() {
        System.out.println("BookRepository: Books => [Spring in Action, Clean Code, Java Concurrency]");
    }
}
