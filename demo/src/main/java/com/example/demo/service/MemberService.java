package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /*
     * 회원 가입
     */
    public Long join(Member member) {
        Optional<Member> byName = memberRepository.findByName(member.getName());
    }
}
