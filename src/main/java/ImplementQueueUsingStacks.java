package main.java;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public static void main(String[] args) {
        ImplementQueueUsingStacks myQueue = new ImplementQueueUsingStacks();
        myQueue.push(1); // queue is: [1]
        System.out.println("null");
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println("null");
        int val = myQueue.peek(); // return 1
        System.out.println(val);
        val = myQueue.pop(); // return 1, queue is [2]
        System.out.println(val);
        boolean isEmpty = myQueue.empty(); // return false
        System.out.println(isEmpty);
    }

    ImplementQueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s2.push(x);
    }

    public int pop() {
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return s1.pop();
    }

    public int peek() {
        while (!s2.empty()) {
            s1.push(s2.pop());
        }

        return s1.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
