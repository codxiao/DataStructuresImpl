package com.LinkedList;

import com.Queue.QueueInterface;

public class queueByLinkedList<E> implements QueueInterface<E> {
    public class Node{
        E element;
        Node next;

        public Node() {
            this.element = null;
            this.next = null;
        }

        public Node(E element) {
            this.element = element;
            this.next=null;
        }
    }

    Node head;
    Node rear;
    int size;
    public queueByLinkedList() {
        head=rear=new Node();
        size=0;
    }

    @Override
    public void inQueue(E e) {
            if (size==0) {
                Node node = new Node(e);
                rear = node;
                head = node;
            }
            else {
                Node node = new Node(e);
                rear.next = node;
                rear=node;
            }

        size++;
    }

    @Override
    public E DeQueue() {
        if (head==null){
            throw new IllegalArgumentException("为空");
        }
        if (size==1){
            E temp=head.element;
            head=null;
            rear=null;
            size--;
            return temp;

        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;
        return temp.element;
    }

    @Override
    public E getFirst(E e) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        Node print=head;
        stringBuilder.append("queue front:    ");
        if (print==null){
            stringBuilder.append("队列为空");
        }else {
            while (print.next != null) {
                stringBuilder.append(print.element);
                stringBuilder.append("->");
                print = print.next;
            }
            stringBuilder.append(print.element);
            stringBuilder.append("->null      rear");
        }

        return stringBuilder.toString();
    }
}
