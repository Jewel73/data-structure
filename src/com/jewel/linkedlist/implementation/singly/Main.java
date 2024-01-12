package com.jewel.linkedlist.implementation.singly;

import com.jewel.linkedlist.implementation.singly.CustomLinkedList;

public class Main {

    public static void main(String[] args) {

        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.append(12);
        list.append(34);
        list.append(98);
        list.append(2);

        list.printlist();
        list.getLength();

        list.removeLast();
        list.append(56);

        list.printlist();
        list.getLength();

        list.prepend(1);
        list.prepend(80);

        list.printlist();
        list.getLength();

        list.insert(0, 4);
        list.printlist();
        list.getLength();

        list.remove(1);
        list.printlist();
        list.getLength();
        list.remove(0);
        list.printlist();
        list.getLength();

        list.revers();
        list.printlist();
        list.getLength();
    }

}
