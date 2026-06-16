package com.java.ps.oopspractice2.lamdaexpression.singleParameterReturnValue;

interface Square{
    int FindSquar(int num);
}
public class Main {
    public void main(String[] args) {
        Square s = num -> {
            return num*num;
        };
        System.out.println(s.FindSquar(5));

    }
}
