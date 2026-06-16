package com.java.ps.oops.functionalinterface.usingnormalway;
interface Greeting{
    void sayHello();
}
class Test implements Greeting {
    @Override
    public void sayHello(){
        System.out.println("Hello Bhopal");
    }
}
public class Main {
    public void main(String[] args) {
        Greeting g = new Test ();
        g.sayHello();

    }
}
