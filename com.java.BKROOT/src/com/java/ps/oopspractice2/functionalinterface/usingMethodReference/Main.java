package com.java.ps.oopspractice2.functionalinterface.usingMethodReference;

interface  Greeting {
    void sayHello();
}
public class Main {
    public static void hello(){
        System.out.println("Hello Devlopers");
    }
    public static void main() {
        Greeting g = Main::hello;
        g.sayHello();

    }
}
