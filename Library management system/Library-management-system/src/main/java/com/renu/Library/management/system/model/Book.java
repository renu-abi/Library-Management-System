package com.renu.Library.management.system.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
    private String id;
    private String author;
    private String ISBN;
    private int publishYear;
    private boolean isAvailable;

    public Book(String id, String author, String ISBN, int publishYear, boolean isAvailable) {
        this.id = id;
        this.author = author;
        this.ISBN = ISBN;
        this.publishYear = publishYear;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

