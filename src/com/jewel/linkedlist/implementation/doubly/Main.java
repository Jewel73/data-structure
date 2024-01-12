package com.jewel.linkedlist.implementation.doubly;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(5);
        doublyLinkedList.append(7);

        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        doublyLinkedList.printList();
        System.out.println("===============");
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.removeLast();
        doublyLinkedList.append(7);
        doublyLinkedList.printList();
    }
}
