package com.jewel.linkedlist.implementation;

public class Main {

    public static void main(String[] args) {

        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.append(12);
        list.append(34);
        list.append(98);
        list.append(2);

        list.printlist();
        list.getHead();
        list.getTail();
        list.getLength();

        list.removeLast();
        list.append(56);

        list.printlist();
        list.getHead();
        list.getTail();
        list.getLength();
    }

}
