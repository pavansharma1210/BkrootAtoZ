package com.java.ps.oopspractice2.lamdaexpression.NoParameterReturnValue;

interface Message {
    String  getMessage();
}
public class Main {
    public static void main(String[] args) {
        Message m = () -> {
            return "Welcome";
        };
        System.out.println(m.getMessage());

    }
}
