package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.BorrowBook;
import com.renu.Library.management.system.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class MongodbBorrowListDao implements BorrowListDao {

    @Autowired
    private MongodbBorrowBookRepo mongodbBorrowBookRepo;

    @Override
    public BorrowBook addBorrowing(BorrowBook borrowBook) {
        mongodbBorrowBookRepo.save(borrowBook);
        return borrowBook;
    }

    @Override
    public List<BorrowBook> getAllBorrowings() {
        return mongodbBorrowBookRepo.findAll(BorrowBook.class);
    }

    @Override
    public BorrowBook getBorrowingById(String id) {
        return mongodbBorrowBookRepo.findById(id, BorrowBook.class);
    }

    @Override
    public BorrowBook updateBorrowing(BorrowBook borrowBook) {
        return mongodbBorrowBookRepo.save(borrowBook);
    }


    @Override
    public boolean deleteBorrowing(String id) {
        BorrowBook borrowBook = getBorrowingById(id);
        if (borrowBook != null) {
            mongodbBorrowBookRepo.remove(borrowBook);
            return true;
        }
        return false;
    }

    @Override
    public BorrowBook borrowBook(String memberId, String bookId) {
        // Create a BorrowBook object with a unique ID
        String id = memberId + "-" + bookId + "-" + System.currentTimeMillis(); // Generate a unique ID
        BorrowBook borrowBook = new BorrowBook(id, memberId, bookId, LocalDate.now());
        mongodbBorrowBookRepo.save(borrowBook); // Save to MongoDB
        return borrowBook;
    }

    @Override
    public BorrowBook returnBook(String borrowingId) {
        BorrowBook borrowBook = getBorrowingById(borrowingId);
        if (borrowBook != null && !borrowBook.isReturned()) {
            borrowBook.setReturned(true);
            borrowBook.setReturnDate(LocalDate.now());
            mongodbBorrowBookRepo.save(borrowBook); // Save updated state back to MongoDB
            return borrowBook;
        }
        throw new IllegalStateException("Borrowing record not found or already returned");
    }
}


