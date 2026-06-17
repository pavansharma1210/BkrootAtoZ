package com.java.ps.advanced.collection;

import java.util.ArrayList;
import java.util.Stack;

public class ListInterfaceExamples {
    static void ArrayListExamples() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1)); //1- based indexing = 2
        l.set(1, 10); //modify at index i
        System.out.println(l);
        System.out.println(l.contains(10)); //true

    }

    static void StackExamples() {   //LIFO
        Stack<String> st = new Stack<>();
        st.push("BK");
        st.push("Root");
        System.out.println(st);
        System.out.println(st.peek()); //root
        System.out.println(st.pop());//root (will also remove it)
        System.out.println(st.peek());
        System.out.println(st.size()); //1
        System.out.println(st.empty()); //false
    }
        public static void main (String[]args){
            //ArrayListExamples();
            StackExamples();
        }
    }

