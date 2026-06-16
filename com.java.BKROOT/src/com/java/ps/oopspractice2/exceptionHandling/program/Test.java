package com.java.ps.oopspractice2.exceptionHandling.program;

//throw and throws
public class Test {
    //used bypass to exception caller method
    void div(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c =a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
     Test t = new Test();
     try{
         t.div(20,0);
     }catch(ArithmeticException e){
         System.out.println("The value of b is Zero");
     }
    }
}
