package oopspractice2.methods;

public class WithParameters {
    static int multiply(int x , int y){
        return x*y;
    }

    public static void main(String[] args) {
        int result = multiply(4,5);
        System.out.println("Result is " + result);
    }
}
