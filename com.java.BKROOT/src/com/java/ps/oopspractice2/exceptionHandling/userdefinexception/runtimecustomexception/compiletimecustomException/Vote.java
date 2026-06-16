package com.java.ps.oopspractice2.exceptionHandling.userdefinexception.runtimecustomexception.compiletimecustomException;

//compiletime exception: compiler force to handle it .
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class Vote {
    static void checkAge(int age)
        throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException(
                "Age must be 18 or above");

        }
        System.out.println("you can vote");
    }
}

