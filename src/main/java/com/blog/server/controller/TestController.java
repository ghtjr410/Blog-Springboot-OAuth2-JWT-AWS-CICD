package com.blog.server.controller;

import com.blog.server.entity.Member;
import com.blog.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }

    @GetMapping("/member/{id}")
    public Optional<Member> getMemberById(@PathVariable Long id) {
        Optional<Member> member = testService.getMemberById(id);
        return member;
    }
}
