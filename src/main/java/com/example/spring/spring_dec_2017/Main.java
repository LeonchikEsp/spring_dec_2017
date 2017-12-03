package com.example.spring.spring_dec_2017;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/main/resources/context.xml");
        context.getBean(TerminatorQuoter.class).SayQuote();
    }
}
