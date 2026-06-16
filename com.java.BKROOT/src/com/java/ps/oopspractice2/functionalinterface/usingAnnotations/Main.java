package com.java.ps.oopspractice2.functionalinterface.usingAnnotations;

@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class Main {
    public void main(String[] args) {
        Greeting g = () ->{
            System.out.println("Hello Devlopers");
        };
        g.sayHello();

    }
}
