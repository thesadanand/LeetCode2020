package com.ll;

class LinkedList{

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if(head==null){
            newNode.next = head;
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void add(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node tmp = head;
            for (int i = 0; i < pos - 1; i++)
                tmp = tmp.next;
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    public void remove(int data){
        Node temp = head;
        int cnt = 0;
        if(head.data==data){
            head = temp.next;
        }else {
            while(temp.data!=data) {
                temp = temp.next;
                cnt++;
            }
            Node preNode = head;
            for(int i=0;i<cnt-1;i++)
                preNode = preNode.next;
            preNode.next = temp.next;
        }
        temp = null;
    }

    public void printLL() {
        if(head==null)
            System.out.println(" ");
        else {
            Node temp = head;
            while(temp.next!=null) {
                System.out.print("->"+temp.data);
                temp = temp.next;
            }
            System.out.print("->"+temp.data);
        }
    }
}

public class LinkList_DS {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(15);
        ll.printLL();
        System.out.println("\n");
        ll.add(2,0);
        ll.printLL();
        System.out.println("\n");
        ll.add(12,3);
        ll.printLL();
        System.out.println("\n");
        ll.add(25,0);
        ll.printLL();
        System.out.println("\n");
        System.out.println("removing node 12");
        ll.remove(12);
        ll.printLL();
        System.out.println("\n");
    }

}
