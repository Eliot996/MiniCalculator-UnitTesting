package com.company;

public class Calculator {

    public int sum(int a, int b){
        if (a > 100 ||b > 100){
            throw new IllegalArgumentException("Can only accept numbers less than 100");
        }
        return a + b;
    }

    public int random(){
        return (int) Math.ceil(Math.random() * 6);
    }
}
