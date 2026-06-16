package com.java.ps.oopspractice2.exceptionHandling.program;

public class Multicatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 2, c;
            c = a / b;
            System.out.println(c);
            //  multiple Catch m Ek Exception  dusre Exception ka code dipend hota h

           int arr[] = {10, 20, 30};
            System.out.println(arr[1]);
            String str = null;
            System.out.println(str.toUpperCase());

        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(" Array Exception");

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch(NumberFormatException x){
            System.out.println(" Numberformet  Exception");
        }catch(Exception y){
            System.out.println("All type Exception");
        }

    }
}
