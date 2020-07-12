package com.arrayList;

import java.util.Arrays;

class MyArrayList {

    static final int INIT_CAPACITY = 4;
    private Object[] data;
    private int index;
    private int size;

    public MyArrayList() {
        this.size = INIT_CAPACITY;
        this.data = new Object[INIT_CAPACITY];
    }

    public void add(Object o){
        if(index==size-1)
            incrementSizeAndReallocate();
        data[index] = o;
        index++;
    }

    private void incrementSizeAndReallocate() {
        this.size = this.size*INIT_CAPACITY;
        Object[] temp = new Object[size];
        for(int i=0;i<data.length;i++)
            temp[i] = data[i];
        this.data = temp;
    }

    public Object get(int idx) throws Exception {
        if(idx > size-1)
            throw new Exception("Index out of range");
        Object o = data[idx];
        return o;
    }

    public void remove(Object o){
        int i=0;
        for(i=0;i<size-1;i++)
            if(data[i]==o)
                break;
        for(int x = i;x<data.length-1;x++){
            data[x] = data[x+1];
        }data[data.length-1]=null;
        index--;
    }

    @Override
    public String toString() {
        return "MyArrayList::  " +Arrays.toString(Arrays.copyOfRange(data,0,index));
    }
}

public class ArrayList_App {
    public static void main(String[] args) throws Exception {
        MyArrayList mal = new MyArrayList();
        mal.add("11");
        mal.add("12");
        mal.add("13");
        mal.add("15");
        System.out.println(mal);
        System.out.println("getting element "+mal.get(2));
        System.out.println("remove element ");mal.remove("12");
        System.out.println(mal);
        mal.add("21");
        mal.add("31");
        System.out.println(mal);
    }
}
