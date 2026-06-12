package com.java.ps.oopspractice2.lamdaexpression;

//Functional interface
interface Greeting {
    void sayHello();
}
public class Main {
    public static void main(String[] args) {
        Greeting g = () -> {
            System.out.println("hello");
        };
        g.sayHello();
    }
}
