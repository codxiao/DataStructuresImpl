package com.Queue;

import java.util.zip.DeflaterOutputStream;

public class loopQueue<E> implements QueueInterface<E> {
    E[] data;
    int size=0;
    int front=0;
    int rear=0;

    public loopQueue() {
    this(10);
    }
    public loopQueue(int capacity){
        data=(E[]) new Object[capacity+1];

    }
    public int getCapacity(){
        return data.length-1;
    }


    @Override
    public void inQueue(E e) {
        if (size==this.getCapacity())
            resize(this.getCapacity()*2+1);

        data[rear]=e;
        rear=(rear+1)%data.length;
        size++;
    }

    private void resize(int i) {
        E[] newData=(E[]) new Object[i];
        for (int j=0;j<size;j++){
            newData[j]=data[(front+j)%data.length];
        }
        data=newData;
        front=0;
        rear=size;
        System.out.println("扩容后"+data.length);
    }

    @Override
    public E DeQueue() {
        if (front==rear){
            throw new IllegalArgumentException("队列为空，无法读取");
        }
        E result=data[front];
        front=(front+1)%data.length;
        size--;
        return result;
    }

    @Override
    public E getFirst(E e) {
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return front==rear;
    }

    @Override
    public int getSize() {
        return size;
    }
    public void getFrontend(){
        System.out.println("front:"+this.front+"  rear:"+this.rear);
    }
}
