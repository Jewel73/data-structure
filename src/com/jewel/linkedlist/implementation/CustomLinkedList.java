package com.jewel.linkedlist.implementation;

public class CustomLinkedList<T> {

    private Node head;
    private Node tail;
    private int size = 0;

    CustomLinkedList(){

    }

    public void append(T value){
        Node<T> node = new Node(value);
        if(size == 0){
            head = node;
            tail = node;
        }else{
            tail.setNextNode(node);
            tail = node;
        }
        size++;
    }

    public Node removeLast(){
        if(size == 0) return null;

        Node temp = head;
        Node pre = head;
        while(temp.nextNode() != null){
            pre = temp;
            temp = temp.nextNode();
        }
        pre.setNextNode(null);
        tail = pre;
        size --;
        if(size == 0){
            tail = null;
            head = null;
        }
        return temp;
    }

    public void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.nextNode();
        }

    }

    public void getHead(){
        System.out.println("Head: "+ head.getValue());
    }
    public void getTail(){
        System.out.println("tail : "+ tail.getValue());
    }

    public void getLength(){
        System.out.println("List length: "+ size);
    }

}
