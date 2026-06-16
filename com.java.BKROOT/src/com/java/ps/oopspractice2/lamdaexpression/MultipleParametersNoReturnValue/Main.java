package com.java.ps.oopspractice2.lamdaexpression.MultipleParametersNoReturnValue;

interface Display {
    void show (int a , int b);
}
public class Main {
    public void main(String[] args) {
        Display d = (a,b) -> {
            System.out.println(a + " " + b);
        };
        d.show(10,20);

    }
}
