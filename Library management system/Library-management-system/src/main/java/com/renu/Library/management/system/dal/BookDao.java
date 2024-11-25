package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Book;

import java.util.List;

public interface BookDao {
    Book addBook(Book book);
    Book getBookById(String id);
    List<Book> getAllBooks();
    Book updateBook(Book book);
    boolean deleteBook(String id);
}
