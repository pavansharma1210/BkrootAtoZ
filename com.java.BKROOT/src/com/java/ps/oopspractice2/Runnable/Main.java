package com.java.ps.oopspractice2.Runnable;

public class Main {
    public static void main(String[] args) {
        //Pass the task to a Thread
        Thread paymentThread = new Thread (new PaymentTask());
       Thread emailThread = new Thread(new EmailTask());
        //EmailTask t1 = new EmailTask();
        //Thread emailThread = new Thread(t1);
        Thread filedounoadThread = new Thread(new FileDownloadTask());
        paymentThread.start();
        emailThread.start();
        filedounoadThread.start();
        Thread employeeTask = new Thread (new EmployeeTask());
        employeeTask.start();
    }
}
