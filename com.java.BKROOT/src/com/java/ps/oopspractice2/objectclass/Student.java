package oopspractice2.objectclass;

//A class is a blueprint / template.
//It defines:
//properties (variables)
//behaviors (methods)
public class Student {
    String name;
    int age;

    //An object is a real instance of a class.
// It holds actual values.
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rakesh";
        s1.age = 20;
        System.out.println(s1.name + "  " + s1.age);

        //Class defines structure, Object uses that structure

    }
}
