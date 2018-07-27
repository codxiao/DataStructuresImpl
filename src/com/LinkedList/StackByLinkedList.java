package com.LinkedList;

import com.Stack.StackInterface;

public class StackByLinkedList<E> implements StackInterface<E> {
        int size=0;
        LinkedList<E> linkedList=new LinkedList<>();
        public boolean isEmpty(){
            return linkedList.isEmpty();
        }
        public void push(E e){
            linkedList.addFirst(e);
            size++;
        }
        public E pop(){

            size--;
            return (linkedList.delete(size-1));

        }

    @Override
    public E peek() {
        return linkedList.getElement(0);
    }

    @Override
    public int getSize() {
        return size;
    }
}
