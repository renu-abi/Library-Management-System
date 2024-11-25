package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class MongodbMemberDao implements MemberDao{

    @Autowired
    private MongodbMemberRepo mongodbMemberRepo;

    @Override
    public Member addMember(Member member) {
        return mongodbMemberRepo.save(member);  // This saves the member to MongoDB
    }

    @Override
    public Member getMemberById(String id) {
        Optional<Member> member = mongodbMemberRepo.findById(id);  // Retrieves the member by ID
        return member.orElse(null);  // Returns null if not found
    }

    @Override
    public List<Member> getAllMembers() {
        return mongodbMemberRepo.findAll();  // Retrieves all members
    }

    @Override
    public Member updateMember(Member member) {
        return mongodbMemberRepo.save(member);  // save() will update if the member exists
    }

    @Override
    public boolean deleteMember(String id) {
        if (mongodbMemberRepo.existsById(id)) {
            mongodbMemberRepo.deleteById(id);  // Deletes the member by ID
            return true;
        }
        return false;  // Returns false if the member wasn't found
    }

    }



