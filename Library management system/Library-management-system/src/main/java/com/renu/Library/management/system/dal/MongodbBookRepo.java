package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongodbBookRepo extends MongoRepository<Book, String> {
}
