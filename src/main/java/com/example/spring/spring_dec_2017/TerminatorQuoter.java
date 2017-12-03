package com.example.spring.spring_dec_2017;

import com.example.spring.spring_dec_2017.MyAnnotation.InjectRandomInteger;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter {
    @InjectRandomInteger(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
        System.out.println("repeat = " + repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Constructor");
        System.out.println("repeat = " + repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void SayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
