package com.renu.Library.management.system.controller;

import com.renu.Library.management.system.model.Member;
import com.renu.Library.management.system.service.Memberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class Membercontroller {
    private Memberservice memberservice;

    @Autowired
    public Membercontroller(Memberservice memberservice){

        this.memberservice = memberservice;
    }
    @PostMapping("/add")
    public Member addMember(@RequestBody Member member) {

        return memberservice.addMember(member);
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable String id) {

        return memberservice.getMemberById(id);
    }

    @GetMapping
    public List<Member> getAllMembers() {

        return memberservice.getAllMembers();
    }

    @PutMapping("/update/{id}")
    public Member updateMember(@PathVariable String id, @RequestBody Member member) {
        member.setId(id);
        return memberservice.updateMember(member);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteMember(@PathVariable String id) {

        return memberservice.deleteMember(id);
    }

}
