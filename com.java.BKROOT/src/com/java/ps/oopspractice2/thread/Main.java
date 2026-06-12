package com.java.ps.oopspractice2.thread;

public class Main {
    static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2 .start();
        t3 .start();
        System.out.println("Active Thread :" + Thread.activeCount());

        /*4 Thread kyu?
                1 Main Thread
        3 Created Threads

        Total = 4*/

    }
}