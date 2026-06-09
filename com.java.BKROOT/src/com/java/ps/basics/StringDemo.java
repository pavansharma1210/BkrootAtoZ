package com.java.ps.basics;

public class StringDemo {
    public static void main(String[] args) {

        // ==========================
        // 1. String (Immutable)
        // ==========================

       String str = "java";
        System.out.println("Before : " + str.hashCode());
        str.concat("Programing"); //new object created but not assigned
        System.out.println("After : " + str);
        str = str.concat(" Programing");//assigned
        System.out.println("After assigned : " + str.hashCode());

        // ==========================
        // 2. StringBuffer (Mutable)
        // ==========================
        StringBuffer sbf = new StringBuffer("java");
        System.out.println("Before : " + sbf.hashCode());
        sbf.append(" programing");
        System.out.println("After append : " +sbf.hashCode());

        // ==========================
        // 3. StringBuilder (Mutable)
        // ==========================
      /*  StringBuilder sbd = new StringBuilder ("java");
        System.out.println("Before : " + sbd.hashCode());
        sbd.append(" Programing");
        System.out.println("after append :" + sbd.hashCode());*/
    }

}
