package com.java.ps.oopspractice2.exceptionHandling.program;

public class throwsDemo {
    public static void main(String[] args) throws InterruptedException{
        for(int i=1; i<=10;i++){
            Thread.sleep(1000);
            System.out.println(i);


        }
    }
}
