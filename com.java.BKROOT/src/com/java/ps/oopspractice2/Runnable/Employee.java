package com.java.ps.oopspractice2.Runnable;

 class Employee {
     void work(){
         System.out.println("working");
     }
}
//Agar tum Thread extend karoge:
//class EmployeeTask extends Thread{
//}
 //To Employee ko extend nahi kar sakte.


 //Lekin Runnable me:
class EmployeeTask extends Employee implements Runnable{
     public void run(){
         System.out.println("Task Running");
     }
 }