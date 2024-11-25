package com.renu.Library.management.system.service;

import com.renu.Library.management.system.dal.MemberDao;
import com.renu.Library.management.system.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Memberservice {
    private MemberDao memberDao;

    @Autowired
    public Memberservice(@Qualifier("mongodbMemberDao") MemberDao memberDao){

        this.memberDao = memberDao;
    }
    public Member addMember(Member member) {
        return memberDao.addMember(member);
    }
    public Member getMemberById(String id) {
        return memberDao.getMemberById(id);
    }

    public List<Member> getAllMembers() {
        return memberDao.getAllMembers();
    }

    public Member updateMember(Member member) {
        return memberDao.updateMember(member);
    }

    public boolean deleteMember(String id) {

        return memberDao.deleteMember(id);
    }


}

