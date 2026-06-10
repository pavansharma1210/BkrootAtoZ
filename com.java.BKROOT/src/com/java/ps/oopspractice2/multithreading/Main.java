package com.java.ps.oopspractice2.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread paymentThread = new Thread (new PaymentTask());
        Thread emailThread = new Thread(new EmailTask());
        Thread filedounoadThread = new Thread(new FileDownloadTask());
        paymentThread.start();
        emailThread.start();
        filedounoadThread.start();
        Thread employeeTask = new Thread (new EmployeeTask());
        employeeTask.start();
    }
}
