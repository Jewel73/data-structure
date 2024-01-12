package com.jewel.linkedlist.implementation.doubly;

public class DoublyLinkedList<T>{

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(T value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    private class Node<T>{
        Node next;
        Node prev;
        T value;
        Node(T value){
            this.value = value;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println("Value is : " + temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head : "+ head.value);
    }

    public void getTail(){
        System.out.println("Tail : "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public void append(T value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if (length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;

    }
}
