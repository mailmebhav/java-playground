package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    int curr_size;

    public static void main(String[] args) {
        ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();
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
// Using 2 Queues
    public ImplementStackUsingQueues() {
        curr_size = 0;
    }

    public void push(int x) {
        curr_size++;
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public int pop() {
        if(q1.isEmpty()) {
            return 0;
        }
        int val = q1.remove();
        curr_size--;
        return val;
    }

    public int top() {
        if(q1.isEmpty()) {
            return 0;
        }
        return q1.peek();
    }

    public boolean empty() {
        if(q1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
