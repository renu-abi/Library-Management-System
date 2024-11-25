package com.renu.Library.management.system.service;

import com.renu.Library.management.system.LibraryManagementSystemApplication;
import com.renu.Library.management.system.dal.BookDao;
import com.renu.Library.management.system.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bookservice {
    private BookDao bookDao;

    @Autowired
    public Bookservice(@Qualifier("mongodbBookDao") BookDao bookDao){

        this.bookDao = bookDao;
    }
    public Book addBook(Book book){

        return  bookDao.addBook(book);
    }
    public Book getBookById(String id){
        return bookDao.getBookById(id);
    }
    public List<Book> getAllBook(){

        return bookDao.getAllBooks();
    }
    public Book updateBook(Book book){

        return bookDao.updateBook(book);
    }
    public boolean deleteBook(String id){
        return bookDao.deleteBook(id);

    }
}
