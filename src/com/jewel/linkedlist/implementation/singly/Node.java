package com.jewel.linkedlist.implementation.singly;

public class Node<T> {
    private T value;
    private Node nextNode;

    public Node(T value){
        this.value = value;
    }

    public void setNextNode(Node node){
        this.nextNode = node;
    }

    public Node nextNode(){
        return nextNode;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
