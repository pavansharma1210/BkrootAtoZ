package com.java.ps.oopspractice2.exceptionHandling.nestedTrycatch;

public class Main {
    public static void main(String[] args) {
        try{
            try{
                int result = 10/0;
            }catch(ArithmeticException e){
                System.out.println("inner catch");
            }
        }catch(Exception e){
            System.out.println("outer catch");
        }
    }
}
