package com.java.ps.advanced.collection;

import java.util.HashSet;

public class SetInterfaceExamples {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); // 1 2 3
        st.add(1);// store only unique value , dublicate not allow
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st);
        System.out.println(st.contains(2)); // false
        System.out.println(st.size()); //2

    }
}
