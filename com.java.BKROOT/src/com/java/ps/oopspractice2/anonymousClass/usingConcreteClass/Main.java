package com.java.ps.oopspractice2.anonymousClass.usingConcreteClass;

class Persion{
    void display(){
        System.out.println("Person class");
}
}

public class Main {
    public static void main(String[] args) {
        Persion p = new Persion(){
            void display(){
                System.out.println("hello indore");
            }
        };
        p.display();
    }
}
