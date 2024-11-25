package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.BorrowBook;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryBorrowListDao implements BorrowListDao {
    private final Map<String, BorrowBook> borrowings = new HashMap<>();


    @Override
    public BorrowBook addBorrowing(BorrowBook borrowBook) {
        // Use the borrowBook's existing ID or generate a unique ID
        borrowings.put(borrowBook.getId(), borrowBook);
        return borrowBook;
    }

    @Override
    public List<BorrowBook> getAllBorrowings() {
        // Directly retrieve values from the map without using streams
        return new ArrayList<>(borrowings.values());
    }

    @Override
    public BorrowBook getBorrowingById(String id) {
        // Return the BorrowBook or create a new one if not found
        return borrowings.get(id); // Returns null if the borrowing does not exist

    }

    @Override
    public BorrowBook updateBorrowing(BorrowBook borrowBook) {
        if (borrowings.containsKey(borrowBook.getId())) {
            borrowings.put(borrowBook.getId(), borrowBook);
        }
        return borrowBook; // Return the updated or unchanged BorrowBook
    }

    @Override
    public boolean deleteBorrowing(String id) {
        // Remove the borrowing record and return true if it was removed, false otherwise
        return borrowings.remove(id) != null;
    }
    @Override
    public BorrowBook borrowBook(String memberId, String bookId) {
        // Create a unique ID for the borrowing record
        String id = memberId + "-" + bookId + "-" + LocalDate.now().toString(); // Use a combination of memberId, bookId, and date for a unique key
        BorrowBook borrowBook = new BorrowBook(id, memberId, bookId, LocalDate.now());
        borrowings.put(id, borrowBook); // Store the BorrowBook with the generated ID
        return borrowBook;
    }

    @Override
    public BorrowBook returnBook(String borrowingId) {
        BorrowBook borrowBook = getBorrowingById(borrowingId);
        if (!borrowBook.isReturned()) {
            borrowBook.setReturned(true);
            borrowBook.setReturnDate(LocalDate.now());
        }
        return borrowBook; // Return the updated BorrowBook
    }
}

