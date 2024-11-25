package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.BorrowBook;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongodbBorrowBookRepo extends MongoRepository<BorrowBook, String> {
    List<BorrowBook> findAll(Class<BorrowBook> borrowBookClass);

    BorrowBook findById(String id, Class<BorrowBook> borrowBookClass);

    void remove(BorrowBook borrowBook);
}
