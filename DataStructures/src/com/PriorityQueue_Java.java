package com;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue_Java {

    public static void main(String[] args) {
//        Queue<Integer> q2 = new LinkedList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(12);
        q.add(9);
        q.add(15);
        q.add(20);
        q.add(7);
        q.add(10);
        System.out.println(" "+q.toString());
        while(!q.isEmpty()){
            System.out.println(" "+q.poll());
        }
    }
}
