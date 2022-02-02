package com.testing.jUnit;

public class SimpleCalculator {

    public int add(int a, int b){
        if(a<0 || b<0)
            throw new IllegalArgumentException("positive number allowed");
        return a+b;
    }
}
