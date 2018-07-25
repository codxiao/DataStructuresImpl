package com.Queue;

public interface QueueInterface<E> {
    void inQueue(E e);
    E DeQueue();
    E getFirst(E e);
    boolean isEmpty();
    int getSize();
}
