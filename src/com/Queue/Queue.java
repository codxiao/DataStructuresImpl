package com.Queue;

import com.Stack.Array;

public class Queue<E> implements QueueInterface<E> {
    Array<E> array;

    public Queue(int capacity) {
        array=new Array<>(capacity);
    }
    public Queue() {
        array=new Array<>(10);
    }


    @Override
    public void inQueue(E e) {
        array.addAtFirst(e);
    }

    @Override
    public E DeQueue() {
        return array.deleteLast();
    }

    @Override
    public E getFirst(E e) {
        return array.getLast();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Queue的大小:");
        stringBuilder.append(getSize());
        stringBuilder.append("Queue的容量:");
        stringBuilder.append(array.getCapacity());
        stringBuilder.append("列尾【");
        for(int i=0;i<getSize();i++){
            stringBuilder.append(array.findByIndex(i));
            if (i!=getSize()-1){
                stringBuilder.append(',');
            }
        }
        stringBuilder.append("】列头");
        return stringBuilder.toString();
    }
}
