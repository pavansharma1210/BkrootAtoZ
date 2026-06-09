package oopspractice2.userdefinedatatype;
import java.util.*;
public class  USerDefineDataType {
    static class Student {
     String name;
     int rno;
     double cgpa;
     void print(){
            System.out.println(name + " " + rno + " " + cgpa);
        }
     // isme input liya h to pehle input dena padega fir output ayega
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             Student s1 = new Student();
             s1.name = "rakesh";
             s1.rno = sc.nextInt();
             s1.cgpa =6.4;

             Student s2 = new Student();
             s2.name = "palesh";
             s2.rno = 34;
             s2.cgpa =6.4;
             System.out.println("student name is " + s1.name + " Roll no is " + s1.rno + " Cgpaa is " + s1.cgpa);
             s2.cgpa=7.5;
             System.out.println(s2.cgpa);
             s1.print();
             s2.print();

        }

    }
}
