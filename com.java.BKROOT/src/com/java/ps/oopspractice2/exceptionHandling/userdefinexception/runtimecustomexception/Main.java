package com.java.ps.oopspractice2.exceptionHandling.userdefinexception.runtimecustomexception;
//cutomruntime exception : compiler not force to handle it.

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}
class vote{
    static void checkAge(int age){
        if(age < 18){
            throw new InvalidAgeException("age must be 18 or above for voting");
        }
        System.out.println("you can vote");
    }
}
public class Main {
    public static void main(String[] args) {
        try{
            vote.checkAge(19);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program Ended");
    }
}
