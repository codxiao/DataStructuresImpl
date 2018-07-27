package com.LinkedList;

import java.util.concurrent.ForkJoinPool;

public class TestLinkedList {
    public static void main(String args[]){

        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<5;i++){
            linkedList.addFirst(i);
        }
        linkedList.set(0,666);
        linkedList.addLast(8888);
        linkedList.delete(2);
        System.out.println(linkedList.toString());

    }



}
