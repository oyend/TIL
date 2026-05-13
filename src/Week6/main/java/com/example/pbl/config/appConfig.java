package com.example.pbl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.pbl.repository.MemoryMemberRepository;
import com.example.pbl.service.MemberService;

// @Configuration
public class appConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
