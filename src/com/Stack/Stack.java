package com.Stack;

public class Stack<E> implements StackInterface<E> {
    Array<E> array;
    public Stack(){
        array=new Array<>();
    }
    public Stack(int capacity) {
        array = new Array<>(capacity);
    }


    @Override
    public void push(E e) {
            array.addAtLast(e);
    }

    @Override
    public E pop() {
        return array.deleteLast();
    }

    @Override
    public E peek() {
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
        stringBuilder.append("栈的容量为");
        stringBuilder.append(array.getCapacity());
        stringBuilder.append("栈底[");
        for (int i=0;i<array.getSize();i++){
            stringBuilder.append(array.findByIndex(i));
            if (i!=array.getSize()-1)
                stringBuilder.append(',');
        }
        stringBuilder.append("]栈顶");
        return stringBuilder.toString();
    }
}
