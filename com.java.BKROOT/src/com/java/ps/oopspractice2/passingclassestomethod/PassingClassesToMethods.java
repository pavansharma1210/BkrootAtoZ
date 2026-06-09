package oopspractice2.passingclassestomethod;

public class PassingClassesToMethods {
    public static class Car{
        String name;
        int seats;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(name + " " + length + " "+ type + " " + torque );
        }

        public static void main(String[] args) {
            Car c1 = new Car();
            c1.name = "bolero";
            c1.seats = 7;
            c1.length = 3.99;
            c1.type = "suv";
            c1.torque = 6;
            change(c1);
            System.out.println(c1.seats);
            c1.print();
        }
            private static void change(Car c1){
               c1.seats = 4;
            }

        }


}
