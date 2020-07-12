package com;

import java.util.Stack;

class MyQueue{

    Stack<Object> enqueueStack;
    Stack<Object> dequeueStack;

    MyQueue(){
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    public void enQueue(Object o){
        System.out.println("added ele::" +o+" ");
        enqueueStack.push(o);
    }


    public Object deQueue(){
        if (dequeueStack.isEmpty()) {
            while(!enqueueStack.isEmpty())
                dequeueStack.push(enqueueStack.pop());
        }
        Object o = dequeueStack.pop();
        System.out.println("removed:: "+o);
        return o;

    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "enqueueStack=" + enqueueStack +
                ", dequeueStack=" + dequeueStack +
                '}';
    }
}

public class QueuesViaStack_leetCode_232 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue("a");
        q.enQueue("b");
        q.enQueue("c");
        q.deQueue();
        q.enQueue("d");
        q.deQueue();
        q.enQueue("e");
        q.enQueue("f");
        q.deQueue();
    }
}
