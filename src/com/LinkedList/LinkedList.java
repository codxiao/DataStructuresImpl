package com.LinkedList;

public class LinkedList<E> {
    private class Node{
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
//        public E getElement(){
//            return this.element;
//        }
//        public Node getNext(){
//            return this.next;
//        }

    }
    private int size;
    private Node dummyHead;

    public LinkedList() {
        dummyHead=new Node();
        size=0;
    }


    public boolean isEmpty(){
        return size==0;
    }
    public void addMiddle(int index,E e){
        if (index<0||index>size)
            throw new IllegalArgumentException("索引值错误");

        Node prev=dummyHead;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
//        Node node=new Node(e);
//        node.next=priv.next;
//        priv.next=node;
        prev.next = new Node(e, prev.next);
        size++;
    }
    public void addFirst(E e){
        addMiddle(0,e);
//        Node node=new Node(e);
////        node.next=head;
////        head=node;
////        size++;
    }
    public void addLast(E e){
        addMiddle(size,e);
    }
    public int getSize() {
        return size;
    }
    public E getElement(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("索引错误");
        }
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.element;
    }
    public void set(int index,E e){
        if (index<0||index>=size){
            throw new IllegalArgumentException("索引错误");
        }
        Node cur=dummyHead.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.element=e;
    }
    public E delete(int index){
        Node prev=dummyHead;
        for (int i=0;i<index-1;i++){
            prev=prev.next;
        }
        Node result=prev.next;
        prev.next=result.next;
        result.next=null;
        size--;

        return result.element;
    }
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        Node cur = dummyHead.next;
        while (cur!=null){
            stringBuilder.append(cur.element);
            cur=cur.next;
            stringBuilder.append("->");
        }
        stringBuilder.append("null");
        return stringBuilder.toString();
    }


}
