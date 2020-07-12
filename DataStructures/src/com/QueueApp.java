package com;

import java.util.Arrays;

class Queue {

    private static final int  CAPACITY = 5;

    private Object[] data;
    private int size;

    Queue(){
        this.size = 0;
        this.data = new Object[CAPACITY];
    }

    public void enQueue(Object o) throws Exception {
        if(this.size == CAPACITY-1)
            throw new Exception("Queue is full");
        data[size] = o;
        size++;
    }
    public Object deQueue() throws  Exception{
        if(this.size == 0)
            throw new Exception("Queue is empty");
        Object o = data[0];
        for(int i=0;i<size-1;i++){
            data[i] = data[i+1];
            data[i+1] = null;
        }
        size--;
        return o;
    }

    @Override
    public String toString() {
        return "Queue{" +Arrays.toString(data) +
                '}';
    }
}


public class QueueApp {
    public static void main(String[] args) throws  Exception{
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(40);
        System.out.println(q);
        q.deQueue();
        System.out.println(q);
        q.deQueue();
        System.out.println(q);
        q.deQueue();
        System.out.println(q);
        q.deQueue();
        System.out.println("empty"+q);


        q.enQueue(4);
        System.out.println(q);
        q.enQueue(8);
        System.out.println(q);

    }
}
