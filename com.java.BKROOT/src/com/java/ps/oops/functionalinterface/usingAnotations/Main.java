package com.java.ps.oops.functionalinterface.usingAnotations;

@FunctionalInterface
interface Greeting{
    void sayhello();
}
public class Main {
    public void main(String[] args) {
        Greeting g = () ->{
            System.out.println("Enjoy Every Movment");
        };
        g.sayhello();


    }
}
