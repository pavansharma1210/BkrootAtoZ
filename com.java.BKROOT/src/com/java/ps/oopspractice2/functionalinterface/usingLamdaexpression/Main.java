package com.java.ps.oopspractice2.functionalinterface.usingLamdaexpression;

@FunctionalInterface
interface Add{
    int sum (int a, int b);
}
public class Main {
    public static void main(String[] args) {
        Add add = (a,b)-> a+b;
            System.out.println(add.sum(10,20));

    }
}
