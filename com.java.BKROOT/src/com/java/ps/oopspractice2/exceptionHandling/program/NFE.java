package com.java.ps.oopspractice2.exceptionHandling.program;

//NUmberFormetException
public class NFE {
    public static void main(String[] args) {
        String str= "pavan"; //"123";
        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
        }catch(NumberFormatException e){
            System.out.println("String " + str + " can not be converted to integer");

        }
        System.out.println("main method endded");
    }
}
