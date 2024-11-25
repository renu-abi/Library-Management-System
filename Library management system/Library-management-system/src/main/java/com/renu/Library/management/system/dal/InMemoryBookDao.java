package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class InMemoryBookDao implements BookDao{
    private HashMap<String, Book> bookStore = new HashMap<>();

    @Override
    public Book addBook(Book book) {
        bookStore.put(book.getId(), book);
        return book;
    }

    @Override
    public Book getBookById(String id) {
        return bookStore.get(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStore.values());
    }

    @Override
    public Book updateBook(Book book) {
        bookStore.put(book.getId(), book);
        return book;
    }

    @Override
    public boolean deleteBook(String id) {
        return bookStore.remove(id) != null;
    }
}
