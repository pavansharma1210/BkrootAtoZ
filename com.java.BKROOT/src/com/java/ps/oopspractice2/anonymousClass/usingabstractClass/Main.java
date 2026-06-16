package com.java.ps.oopspractice2.anonymousClass.usingabstractClass;

abstract class Animal{
    abstract void sound();
}
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            void sound(){
                System.out.println("dog Barks");
            }
        };
        a.sound();

    }
}
