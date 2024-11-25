package com.renu.Library.management.system.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "members")
public class Member {
    private  String id; // Unique identifier for the member
    private String name;
    private String memberId;
    private String contactInfo;
    private List<BorrowBook> borrowingHistory;

    public Member(String id, String name, String memberId, String contactInfo, List<String> borrowingHistory) {
        this.id = id;
        this.name = name;
        this.memberId = memberId;
        this.contactInfo = contactInfo;
        this.borrowingHistory = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<BorrowBook> getBorrowingHistory() {

        return borrowingHistory;
    }

    public void setBorrowingHistory(List<BorrowBook> borrowingHistory) {

        this.borrowingHistory = borrowingHistory;
    }
}
