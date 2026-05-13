package com.example.pbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.pbl.service.MemberService;

@SpringBootApplication
public class pblApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(pblApplication.class, args);
        MemberService bean = context.getBean(MemberService.class);
        System.out.println(bean);
    }
        }