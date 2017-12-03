package com.example.spring.spring_dec_2017;

import com.example.spring.spring_dec_2017.MyAnnotation.InjectRandomInteger;

public class TerminatorQuoter implements Quoter {
    @InjectRandomInteger(min = 2, max = 7)
    private int repeat;

    private String message;

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
