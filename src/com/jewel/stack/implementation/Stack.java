package com.jewel.stack.implementation;

public class Stack <T>{

    private Node top;
    private int length;


    private class Node{
        Node next;
        T value;

        Node(T value) {
            this.value = value;
        }
    }

    public Stack(T value){
        Node newNode = new Node(value);
        top = newNode;
        length = 1;
    }

    public Node pop(){
        if (length == 0) return null;
        Node temp = top;
        top = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public boolean push(T value){
        Node newNode = new Node(value);
        if (length != 0) {
            newNode.next = top;
        }
        top = newNode;

        length++;
        return true;
    }

    public void printStac(){
        Node temp = top;
        System.out.println();
        while(temp != null){
            System.out.print(" "+ temp.value);
            temp = temp.next;
        }
    }
}
