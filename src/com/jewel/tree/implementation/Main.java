package com.jewel.tree.implementation;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(6);
        System.out.println(bst.insert(3));
        System.out.println(bst.insert(7));
        System.out.println(bst.insert(1));
        System.out.println(bst.insert(8));


        System.out.println(bst.contain(2));
        System.out.println(bst.contain(3));
        bst.getRoot();

    }
}
