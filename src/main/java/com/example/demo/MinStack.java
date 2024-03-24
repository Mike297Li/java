package main.java.com.example.demo;

import java.util.*;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack minElem = new MinStack();

        minElem.push(4);
        minElem.push(5);
        minElem.push(1);
        minElem.push(9);

        minElem.pop();
        minElem.push(2);

        System.out.println(" Minimum Element from Stack: " + minElem.getMin());
    }
}

