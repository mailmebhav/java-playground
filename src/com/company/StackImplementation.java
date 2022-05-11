package com.company;

import java.util.Stack;

public class StackImplementation {
    Stack<Integer> s;

    public static void main(String[] args) {
        StackImplementation myStack = new StackImplementation();
        myStack.push(1);
        System.out.println("null");
        myStack.push(2);
        System.out.println("null");
        int val;
        val = myStack.top(); // return 2
        System.out.println(val);
        val = myStack.pop(); // return 2
        System.out.println(val);
        boolean isEmpty;
        isEmpty = myStack.empty();
        System.out.println(isEmpty);
    }

    StackImplementation() {
        s = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
    }

    public int pop() {
        if(s.isEmpty()) {
            return -1;
        }
        return s.pop();
    }

    public int top() {
        if(s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }

    public boolean empty() {
        return s.isEmpty();
    }
}
