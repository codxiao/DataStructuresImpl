package com.LinkedList;

public class LinkedList<E> {
    class Node{
        private E element;
        private Node next;

        public Node() {
            this.element=null;
            this.next=null;
        }

        public Node(E element) {
            this.element = element;
            next=null;
        }
        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
        public E getElement(){
            return this.element;
        }
        public Node getNext(){
            return this.next;
        }

    }
    int size;
    Node head;

    public LinkedList() {
        head=new Node(null,null);
        size=0;
    }

//    public LinkedList(E e) {
//        head=new Node(e);
//        size=1;
//    }
    public void addFirst(E e){
        addMiddle(0,e);
//        Node node=new Node(e);
////        node.next=head;
////        head=node;
////        size++;
    }
    public void addMiddle(int index,E e){
        if (index<0||index>size)
            throw new IllegalArgumentException("索引值错误");

        Node priv=head;
        for(int i=0;i<index;i++){
            priv=priv.next;
        }
        Node node=new Node(e);
        node.next=priv.next;
        priv.next=node;
        size++;
    }
    public void addLast(E e){
        addMiddle(size,e);
    }
    public int getSize() {
        return size;
    }

}
