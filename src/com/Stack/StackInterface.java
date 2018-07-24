package com.Stack;

public interface StackInterface<E> {
    //压栈
    void push(E e);
    //出栈
    E pop();
    //获取栈顶元素
    E peek();
    //判断是否为空
    boolean isEmpty();

    //获取栈大小
    int getSize();

}
