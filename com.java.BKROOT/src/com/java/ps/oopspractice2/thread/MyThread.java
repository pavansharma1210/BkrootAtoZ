package com.java.ps.oopspractice2.thread;

 class MyThread extends Thread  {
     @Override
     public void run(){
         System.out.println(getName() + "Thread is running ");
     }
}
