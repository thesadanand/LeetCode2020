package com.heap;

import java.util.ArrayList;
import java.util.List;

class BST {
    public static final String MIN_MAX_HEAP_FLAG = "Max";
    List<Integer> items = new ArrayList<>();

    public void add(int x){
        items.add(x);
        int index = items.indexOf(x);
        heapify(index,x);
    }

    public void heapify(int index,int x){
        //MAX_HEAP
        if(MIN_MAX_HEAP_FLAG.equalsIgnoreCase("max")){
            while(items.size()>1 && x > items.get(getParentIdx(x)))
                swap(items.indexOf(x),getParentIdx(x));
        }//MIN_HEAP
        else{
            while(items.size()>1 && x < items.get(getParentIdx(x)))
                swap(items.indexOf(x),getParentIdx(x));
            }
    }

    private int getParentIdx(int newItem){
        int index = items.indexOf(newItem);
        return (index-1)/2;
    }

    private void swap(int parentIdx, int index) {
        int temp = items.get(index);
        items.set(index, items.get(parentIdx));
        items.set(parentIdx,temp);
    }

    @Override
    public String toString() {
        return "BST{" +
                "items=" + items +
                '}';
    }
}
public class MinHeapApp {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(10);
        bst.add(20);
        bst.add(15);
        bst.add(30);
        bst.add(40);
        bst.add(5);
        System.out.println(bst);
    }
}
