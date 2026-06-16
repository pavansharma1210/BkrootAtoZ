package com.java.ps.oopspractice2.lamdaexpression.singlePerameterNoReturnvalue;

interface PrintNumber{
    void print(int num);
}
public class Main {
    public static void main(String[] args) {
        PrintNumber p =  (num) ->{
            System.out.println((num));
        };
        p.print(5);
    }
}
