package com.company;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s1));
        System.out.println(validParentheses.isValid(s2));
        System.out.println(validParentheses.isValid(s3));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!stack.empty()) {
                char top = stack.peek();
                if(top == '[' && c == ']') {
                    stack.pop();
                } else if(top == '{' && c == '}') {
                    stack.pop();
                } else if(top == '(' && c == ')') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
