package com.java.ps.basics.factorypettern;

//Step 1: Create Interface
interface Payment {
    void pay(double amount);
}
//Step 2: Implement Classes UPI Payment
class UpiPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
//Credit Card Payment
class CreaditCardPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Credit Card");

    }
}
//paypal Payment
class PaypalPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹" + amount + " using Paypal");
    }
}
//Step 3: Create Factory Class
class PaymentFactory{
    public static Payment getPayment(String paymentType) {
        if (paymentType == null) {
            return null;
        }
        if(paymentType.equalsIgnoreCase("UPI")){
            return new UpiPayment();
        }
        if(paymentType.equalsIgnoreCase("Card")){
            return new CreaditCardPayment();
        }
        if(paymentType.equalsIgnoreCase("PAYPAL")){
            return new PaypalPayment();
        }
        return null;
    }
}
public class Main{
    public static void main(String[] args) {
        Payment payment1 = PaymentFactory.getPayment("UPI");
        payment1.pay(1000);
        Payment payment2 = PaymentFactory.getPayment("CARD");
        payment2.pay(5000);
        Payment payment3 = PaymentFactory.getPayment("PAYPAL");
        payment3.pay(3000);

    }

}


