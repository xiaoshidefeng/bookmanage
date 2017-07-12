package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.domain.Repository.BookRepository;
import com.example.demo.domain.Result;
import com.example.demo.service.BookService;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cw on 2017/7/12.
 */
@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    /**
     * 查询所有书籍
     * @return
     */
    @GetMapping("/books")
    public List<Book> books() {
        return bookRepository.findAll();
    }

    /**
     * 添加一本书
     * @param
     * @param
     * @return
     */
    @PostMapping("/insertBook")
    public Result insertBook(@Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(0, bindingResult.getFieldError().getDefaultMessage());
        }

        System.out.println(book.getName() + "11111111111111111111");
        return ResultUtil.success(bookRepository.save(book));

    }

    /**
     * 更新一本书
     * @param book_id
     * @param book
     * @return
     */
    @PostMapping("updateBook/{book_id}")
    public Book updateBook(@PathVariable("book_id") Integer book_id,
                           @Valid Book book) {
        book.setBookid(book_id);
        return bookRepository.save(book);
    }

    /**
     * 删除一本书
     * @param book_id
     */
    @PostMapping("/deleteBook/{book_id}")
    public void deleteBook(@PathVariable("book_id") Integer book_id) {
        bookRepository.delete(book_id);
    }
}
