package com.java.ps.oopspractice2.functionalinterface.usingAnonymousClass;

interface Greeting{
    void sayHello();
}
public class Main {
    public void main(String[] args) {
        Greeting g = new Greeting(){
        public void sayHello(){
            System.out.println("Hello");
        }
        } ;
        g.sayHello();

    }
}
