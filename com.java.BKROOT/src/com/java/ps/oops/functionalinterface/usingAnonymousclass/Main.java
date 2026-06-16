package com.java.ps.oops.functionalinterface.usingAnonymousclass;
interface  Greeting{
    void sayhello();
}
public class Main {
    public void main(String[] args) {
        Greeting g = new Greeting(){
            public void sayhello(){
                System.out.println("Hello");
            }
        };
        g.sayhello();
    }
}
