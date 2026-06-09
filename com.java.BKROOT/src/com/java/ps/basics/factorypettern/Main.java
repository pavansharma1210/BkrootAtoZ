package com.java.ps.basics.factorypettern;

//Step 1: Create Interface
interface Payment {
    void pay();
}
//Step 2: Implement Classes UPI Payment
class UpiPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("payment through upi");
    }
}
//Credit Card Payment
class CreaditCardPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("payment throw CreaditCard");

    }
}
//paypal Payment
class PaypalPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("payment throw Paypal");
    }
}
//Step 3: Create Factory Class
class PaymentFactory{
    public static Payment getPayment(String type) {
        if(type.equalsIgnoreCase("UPI")){
            return new UpiPayment();
        }
        if(type.equalsIgnoreCase("Card")){
            return new CreaditCardPayment();
        }
        if(type.equalsIgnoreCase("PAYPAL")){
            return new PaypalPayment();
        }
        return null;
    }
}
public class Main{
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay();

    }

}


