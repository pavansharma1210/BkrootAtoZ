package com.java.ps.oopspractice2.Runnable;
//implementing runnable intarfce
class PaymentTask implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName() + "Processing Payment");
    }
    }
    class EmailTask implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + "sending email");
    }
    }
    class FileDownloadTask implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() +"file downloading");
    }
    }

