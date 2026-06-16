package com.java.ps.oopspractice2.exceptionHandling.userdefinexception.runtimecustomexception.compiletimecustomException;

public class Main {
    public static void main(String[] args) {

try{
    Vote.checkAge(15);
}catch(InvalidAgeException e){
    System.out.println("Exception" + e.getMessage());
}
        System.out.println("program continue");
    }
}
