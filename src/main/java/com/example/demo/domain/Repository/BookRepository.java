package com.example.demo.domain.Repository;

import com.example.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cw on 2017/7/12.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
//    public List<Book> findAll();
}
