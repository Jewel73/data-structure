package com.jewel.stack.implementation;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(5);
        stack.printStac();
    }
}
