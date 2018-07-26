package com.Queue;

public class TestQueue {
    public static void main(String args[]){
        loopQueue<Integer> queue=new loopQueue<>(3);
        queue.inQueue(1);
        queue.getFrontend();
        System.out.println(queue.DeQueue());

        queue.inQueue(2);
        queue.getFrontend();
        System.out.println(queue.DeQueue());

        queue.inQueue(3);
        queue.getFrontend();
        System.out.println(queue.DeQueue());

        queue.inQueue(4);
        queue.getFrontend();
        System.out.println(queue.DeQueue());



        queue.getFrontend();




    }
}
