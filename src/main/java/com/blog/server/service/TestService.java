package com.blog.server.service;

import com.blog.server.entity.Member;
import com.blog.server.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository; // 빈 주입

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }
    public Optional<Member> getMemberById(Long id){
        return memberRepository.findById(id);
    }
}
