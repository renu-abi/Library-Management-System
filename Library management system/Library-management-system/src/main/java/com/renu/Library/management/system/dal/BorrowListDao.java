package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.BorrowBook;

import java.util.List;

public interface BorrowListDao {
    BorrowBook addBorrowing(BorrowBook borrowBook);
    List<BorrowBook> getBorrowingById(String id);
    public List<BorrowBook> getAllBorrowings();
    BorrowBook updateBorrowing(BorrowBook borrowBook);
    boolean deleteBorrowing(String id);
    BorrowBook borrowBook(String memberId, String bookId); // Method to borrow a book
    BorrowBook returnBook(String borrowingId); // Method to return a book

}
