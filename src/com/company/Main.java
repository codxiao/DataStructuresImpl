package com.company;

import com.Stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }
}
