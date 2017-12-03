package com.example.spring.spring_dec_2017;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/main/resources/context.xml");
        while (true) {
            Thread.sleep(100);
            context.getBean(Quoter.class).SayQuote();
        }
    }
}
