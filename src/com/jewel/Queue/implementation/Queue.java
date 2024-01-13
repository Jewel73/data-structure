package com.jewel.Queue;

public class Queue <T>{
    private Node first;
    private Node last;
    private int length;

    public Queue(T value){
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        length++;
    }

    // 1 => 2 => 3 =>  first = 1; last = 3

    public void enQueue(T value){
        Node newNode = new Node(value);

        if(length == 0){
            this.first = newNode;
        }else {
            this.last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public T deQueue(){
        if(length == 0) return null;
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }

        return (T) temp.value;
    }

    public void getFirst(){
        System.out.println("First : "+ first.value);
    }

    public void getLast(){
        System.out.println("Last : "+ last.value);
    }

    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public void printQueue(){
        Node temp = first;

        while (temp != null){
            System.out.print(" "+ temp.value);
            temp = temp.next;
        }
    }
}

class Node<T>{
    Node next;
    T value;

    Node(T value){
        this.value = value;
    }
}
