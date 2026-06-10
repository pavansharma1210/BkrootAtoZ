package com.java.ps.oopspractice2.multithreading;

class PaymentTask implements Runnable {
    public void run(){
        System.out.println("Processing Payment");
    }
    }
    class EmailTask implements Runnable{
    public void run(){
        System.out.println("sending email");
    }
    }
    class FileDownloadTask implements Runnable{
    public void run(){
        System.out.println("file downloading");
    }
    }

