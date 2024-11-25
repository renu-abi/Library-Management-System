package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Repository
public class InMemoryMemberDao implements MemberDao{
    private HashMap<String, Member> memberStore = new HashMap<>();

    @Override
    public Member addMember(Member member) {
        memberStore.put(member.getId(), member);
        return member;
    }

    @Override
    public Member getMemberById(String id) {
        return memberStore.get(id);
    }

    @Override
    public List<Member> getAllMembers() {
        return new ArrayList<>(memberStore.values());
    }

    @Override
    public Member updateMember(Member member) {
        memberStore.put(member.getId(), member);
        return member;

    }

    @Override
    public boolean deleteMember(String id) {
        return memberStore.remove(id) != null;
    }



}


