package com.renu.Library.management.system.controller;

import com.renu.Library.management.system.model.Book;
import com.renu.Library.management.system.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class Bookcontroller {
    private Bookservice bookservice;

    @Autowired
    public Bookcontroller(Bookservice bookservice){

        this.bookservice = bookservice;
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){

        return bookservice.addBook(book);
    }
    @GetMapping
    public List<Book> getAllBook(){

        return bookservice.getAllBook();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id){

        return bookservice.getBookById(id);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable String id, @RequestBody Book book){
        book.setId(id);
        return bookservice.updateBook(book);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteBook(@PathVariable String id){
        return bookservice.deleteBook(id);

    }
}
