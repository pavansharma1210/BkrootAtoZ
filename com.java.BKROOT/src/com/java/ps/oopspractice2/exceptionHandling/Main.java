package com.java.ps.oopspractice2.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int sum = a / b;
        } catch (ArithmeticException e) {
            System.out.println("number cannot divide by Zero");
        } finally {
            System.out.println("program continue ");
        }
    }
}
