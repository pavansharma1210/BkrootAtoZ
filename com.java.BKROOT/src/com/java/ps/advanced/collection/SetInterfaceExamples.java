package com.java.ps.advanced.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExamples {
    static void Hashsetexample(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); // 1 2 3
        st.add(1);// store only unique value , dublicate not allow
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st);
        System.out.println(st.contains(2)); // false
        System.out.println(st.size()); //5
    }
    static void LinkedHashsetExample() { //order of insertion preserve ho jata h
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
    }
    static void TreesetExample(){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(20);
        ts.add(13);
        System.out.println(ts);
    }
    public static void main(String[] args) {
        //Hashsetexample();
       // LinkedHashsetExample();
        TreesetExample();

    }
}
