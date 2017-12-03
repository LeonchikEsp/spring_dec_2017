package com.example.spring.spring_dec_2017;

import com.example.spring.spring_dec_2017.MyAnnotation.DeprecatedClass;
import com.example.spring.spring_dec_2017.MyAnnotation.InjectRandomInteger;
import com.example.spring.spring_dec_2017.MyAnnotation.PostProxy;
import com.example.spring.spring_dec_2017.MyAnnotation.Profiling;

import javax.annotation.PostConstruct;

@DeprecatedClass(newImplementation = T1000.class)
@Profiling
public class TerminatorQuoter implements Quoter {

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

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

    @PostProxy
    @Override
    public void SayQuote() {
        System.out.println("Post proxy");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
