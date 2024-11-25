package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class MongodbBookDao implements BookDao{

    @Autowired
    private MongodbBookRepo mongodbBookRepo;

    @Override
    public Book addBook(Book book) {
        return mongodbBookRepo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return mongodbBookRepo.save(book);
    }

    @Override
    public boolean deleteBook(String id) {
       if(mongodbBookRepo.existsById(id)){
           mongodbBookRepo.deleteById(id);
           return true;
       }
       return false;
    }

    @Override
    public Book getBookById(String id) {
        Optional<Book> book = mongodbBookRepo.findById(id);
        return book.orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return mongodbBookRepo.findAll();
    }
}
