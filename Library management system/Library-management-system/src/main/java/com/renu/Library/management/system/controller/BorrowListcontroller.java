package com.renu.Library.management.system.controller;

import com.renu.Library.management.system.model.BorrowBook;
import com.renu.Library.management.system.service.BorrowListservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowbooks")
public class BorrowListcontroller {
    private BorrowListservice borrowListservice;

    @Autowired
    public BorrowListcontroller(BorrowListservice borrowListservice){
        this.borrowListservice = borrowListservice;
    }
    @PostMapping("/add")
    public BorrowBook addBorrowing(@RequestBody BorrowBook borrowBook) {
        return borrowListservice.addBorrowing(borrowBook);
    }
    @GetMapping("/{id}")
    public BorrowBook getBorrowingById(@PathVariable String id) {
        return borrowListservice.getBorrowingById(id);
    }
    @GetMapping
    public List<BorrowBook> getAllBorrowings() {
        return borrowListservice.getAllBorrowings();
    }

    @PutMapping("/update/{id}")
    public BorrowBook updateBorrowing(@PathVariable String id, @RequestBody BorrowBook borrowBook) {
        borrowBook.setId(id);
        return borrowListservice.updateBorrowing(borrowBook);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteBorrowing(@PathVariable String id) {
        return borrowListservice.deleteBorrowing(id);
    }

}
