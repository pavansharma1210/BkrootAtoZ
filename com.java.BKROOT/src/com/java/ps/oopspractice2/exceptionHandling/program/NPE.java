package com.java.ps.oopspractice2.exceptionHandling.program;

//NullpPinterException
public class NPE {
    public static void main(String[] args) {
        String str = null;     //"ankit";
        System.out.println(str);
        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Hello i am NullPointerException ");
        }
    }
}
