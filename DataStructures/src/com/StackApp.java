package com;

import java.util.ArrayList;
import java.util.List;

class Stack{

    private int top;
    private List<Integer> data;

    Stack(){
        this.top = -1;
        data = new ArrayList<>();
    }

    public void push(int p){
        this.data.add(p);
        top++;
    }

    public int pop() throws Exception {
        int n = 0;
        if(this.top==-1)
            throw new Exception("Stack is empty");
        else{
            n = this.data.remove(top);
            top--;
        }
        return n;
    }

    public int peek(){
        return this.data.get(top);
    }

    public void printAll(){
        System.out.println(data.toString());
    }
}

public class StackApp {
    public static void main(String[] args) throws Exception {

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.printAll();
        System.out.println("Peek:: "+s.peek());
        System.out.println("pop:: "+s.pop());
        s.printAll();
    }
}
