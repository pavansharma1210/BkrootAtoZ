package com.java.ps.oopspractice2.exceptionHandling.throow;

public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age<18){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");

    }

}
