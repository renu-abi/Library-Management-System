package com.renu.Library.management.system.service;

import com.renu.Library.management.system.dal.BorrowListDao;
import com.renu.Library.management.system.model.BorrowBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowListservice {
    private BorrowListDao borrowListDao;

    @Autowired
    public BorrowListservice(@Qualifier("mongodbBorrowListDao") BorrowListDao borrowListDao){

        this.borrowListDao = borrowListDao;
    }
    public BorrowBook addBorrowing(BorrowBook borrowBook) {

        return borrowListDao.addBorrowing(borrowBook);
    }

    public BorrowBook getBorrowingById(String id) {

        return (BorrowBook) borrowListDao.getBorrowingById(id);
    }

    public List<BorrowBook> getAllBorrowings() {
        return borrowListDao.getAllBorrowings();
    }

    public BorrowBook updateBorrowing(BorrowBook borrowBook) {
        return borrowListDao.updateBorrowing(borrowBook);
    }

    public boolean deleteBorrowing(String id) {
        return borrowListDao.deleteBorrowing(id);
    }
}

