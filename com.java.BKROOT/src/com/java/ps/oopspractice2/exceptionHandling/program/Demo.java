package com.java.ps.oopspractice2.exceptionHandling.program;

public class Demo {
    public static void Wait() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
        public static void main(String[] args){

            try {
                Wait();
                System.out.println(10 / 0);
            } catch (Exception  e) {
                System.out.println("Exception handald");
            }
            System.out.println("main method ended");
        }
    }

