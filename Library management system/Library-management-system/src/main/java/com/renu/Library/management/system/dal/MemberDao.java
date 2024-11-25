package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Member;

import java.util.List;

public interface MemberDao {
    Member addMember(Member member);
    Member getMemberById(String id);
    List<Member> getAllMembers();
    Member updateMember(Member member);
    boolean deleteMember(String id);


}
