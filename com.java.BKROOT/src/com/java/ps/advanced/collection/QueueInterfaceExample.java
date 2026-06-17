package com.java.ps.advanced.collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterfaceExample {
    static void priorityQueueExampels(){
         PriorityQueue<Integer> pq = new PriorityQueue<>(); //min pq
      //  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek()); // 5- the smallest elmt has the highest priority
        System.out.println(pq.poll()); // 5 will remove
        System.out.println(pq);
        System.out.println(pq.peek());


    }

    static void QueueExample(){
        // Linked list ko as a queue use kiya h kyoki bo implements karti h queue ko.

        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());// frount pe kya h - 1
        System.out.println(q.poll());//1 - will also remove
        System.out.println(q);
        System.out.println(q.peek());// ab frount pe -2 h
        System.out.println(q);
        System.out.println(q.isEmpty());//false
        System.out.println(q.size());

    }
    public static void main(String[] args) {
        priorityQueueExampels();
       // QueueExample();


    }

}
