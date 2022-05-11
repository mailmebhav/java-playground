package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingSingleQueue {
    Queue<Integer> q;

    public static void main(String[] args) {
        ImplementStackUsingSingleQueue myStack = new ImplementStackUsingSingleQueue();
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

    ImplementStackUsingSingleQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
            int y = q.remove();
            q.add(y);
        }
    }

    public int pop() {
        if(q.isEmpty()) {
            return -1;
        }
        return q.remove();
    }

    public int top() {
        if(q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
