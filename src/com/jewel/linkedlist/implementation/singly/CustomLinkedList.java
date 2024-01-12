package com.jewel.linkedlist.implementation.singly;

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

    public void prepend(T value){
        Node<T> node = new Node<>(value);
        node.setNextNode(head);
        head = node;
        if(size == 0) tail = node;
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

    public Node removeFirst(){
        if(size == 0) return null;
        Node tempNode = head;
        head = head.nextNode();
        tempNode.setNextNode(null);
        size--;
        if(size == 0) tail = null;
        return tempNode;
    }

    public Node get(int index){
        if(index < 0 || index >=  size) return null;
        Node temp = head;
        for(int i=0; i < index; i++) temp = temp.nextNode();
        return temp;
    }

    public boolean set(int index, T value){
        Node node = get(index);

        if(node != null){
            node.setValue(value);
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value){
        if (index < 0 || index > size) return false;

        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == size){
            append(value);
            return true;
        }

        Node<T> newNode = new Node(value);
        Node temp = get(index-1);
        newNode.setNextNode(temp.nextNode());
        temp.setNextNode(newNode);
        size++;
        return true;


    }


    public Node remove(int index){

        if(index < 0 || index >= size) return null;
        Node removeNode = get(index);
        if(index == 0){
            removeFirst();
            return removeNode;
        }

        if(index == (size-1)){
            removeLast();
            return removeNode;
        }

        Node temp = get(index-1);
        temp.setNextNode(removeNode.nextNode());
        removeNode.setNextNode(null);
        size--;
        return removeNode;

    }


    public void revers(){
        if(size == 0 ) return;
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;

        for(int i=0; i<size; i++){
          Node after = temp.nextNode();
          temp.setNextNode(before);
          before = temp;
          temp = after;
        }

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
