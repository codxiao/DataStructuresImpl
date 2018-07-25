package com.Queue;

public class TestQueue {
    public static void main(String args[]){
        Queue<Integer> queue=new Queue<>(3);
        queue.inQueue(1);
        queue.inQueue(2);
        queue.inQueue(3);
        queue.inQueue(4);
        queue.DeQueue();
        queue.DeQueue();
        System.out.println(queue.toString());
    }
}
