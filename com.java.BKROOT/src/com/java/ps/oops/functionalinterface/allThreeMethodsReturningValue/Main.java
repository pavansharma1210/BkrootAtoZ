package com.java.ps.oops.functionalinterface.allThreeMethodsReturningValue;

interface Calculator{
    int add (int a , int b);

    default int multiplay (int a, int b) {
        return a * b;
    }
    static int squar(int num){
        return num*num;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = (a,b) ->{
            return a+b;
        };
        System.out.println(c.add(10,20));
        System.out.println(c.multiplay(10,20));
        System.out.println(Calculator.squar(5));
    }

}
