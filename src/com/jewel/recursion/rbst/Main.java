package com.jewel.recursion.rbst;

public class Main {

    public static void main(String[] args) {

        RecursiveBinarySearchTree rbst = new RecursiveBinarySearchTree(40);
        rbst.insert(20);
        rbst.insert(50);

        System.out.println("Root value:" + rbst.root.value);
        System.out.println("Root Left:" + rbst.root.left.value);
        System.out.println("Root Left:" + rbst.root.right.value);
    }
}
