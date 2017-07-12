package com.example.demo.service;

import com.example.demo.domain.Book;

import java.util.List;

/**
 * Created by cw on 2017/7/12.
 */
public interface BookService {
    public List<Book> findAllBook();

    public Book insertBook(Book book);

    public Book updateBook(Book book);

    public void deleteBookById(Integer id);
}

