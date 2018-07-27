package com.LinkedList;

public class TestQueue {
    public static void main(String[] args){
        queueByLinkedList<Integer> queue=new queueByLinkedList<>();
        for (int i=1;i<20;i++){
        queue.inQueue(i);
        if (i%5==0)
            queue.DeQueue();
        System.out.println(queue.toString());
//        if (i%3==0){
//            queue.DeQueue();
//            System.out.println(queue.toString());
//        }
        }

     //   queue.DeQueue();

    }
}
