package com.java.ps.oopspractice2.exceptionHandling.multiplecatchblock;

public class Main {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("NullPointer Exception" + e.getMessage());
        }

    }
}
