package com.renu.Library.management.system.model;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Document(collection = "borrowbooks")
public class BorrowBook implements List<BorrowBook> {

    private String id; // Unique identifier for the borrowing
    private String bookId;
    private String memberId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private boolean isReturned;


    public BorrowBook(String id, String bookId, String memberId, LocalDate borrowDate, LocalDate returnDate, boolean isReturned) {
        this.id = id;
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.isReturned = isReturned;

    }

    public BorrowBook(String id, String memberId, String bookId, LocalDate now) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<BorrowBook> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(BorrowBook borrowBook) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends BorrowBook> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends BorrowBook> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public BorrowBook get(int index) {
        return null;
    }

    @Override
    public BorrowBook set(int index, BorrowBook element) {
        return null;
    }

    @Override
    public void add(int index, BorrowBook element) {

    }

    @Override
    public BorrowBook remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<BorrowBook> listIterator() {
        return null;
    }

    @Override
    public ListIterator<BorrowBook> listIterator(int index) {
        return null;
    }

    @Override
    public List<BorrowBook> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}

