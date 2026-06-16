package com.java.ps.oopspractice2.functionalinterface.normalWay;

interface Greeting{
    // Only one abstract method
    void sayHello();
        }
 class Test implements Greeting{
    public void sayHello(){
        System.out.println("hello");
    }
}
