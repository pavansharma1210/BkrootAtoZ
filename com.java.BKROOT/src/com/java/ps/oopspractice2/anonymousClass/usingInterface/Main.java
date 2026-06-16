package com.java.ps.oopspractice2.anonymousClass.usingInterface;

interface Greeting {
    void sayHello();
}
public class Main {
    public static void main(String[] args) {

        // Reference variable of interface type
        Greeting g =
                // Creating anonymous class object
                new Greeting(){
            @Override
            // Implementing interface method
            public void sayHello(){
                System.out.println("Hello Enginners");
            }
        }; // Anonymous class ends here
        g.sayHello();
    }
}
