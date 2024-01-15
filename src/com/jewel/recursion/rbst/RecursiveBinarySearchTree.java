package com.jewel.recursion.rbst;

public class RecursiveBinarySearchTree {
    public Node root;

    RecursiveBinarySearchTree(){}

    RecursiveBinarySearchTree(int value){
        Node newNode = new Node(value);
        this.root = newNode;
    }

    private Node rInsert(Node currentNode,int value){
        if(currentNode == null ) return new Node(value);
        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        }else if (value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }

        return currentNode;
    }

    public void insert(int value){
        this.rInsert(root, value);
    }

    public void delete(int value){
        this.rDelete(root, value);
    }

    private Node rDelete(Node currentNode,int value){

        if(value < currentNode.value){
            currentNode.left = rDelete(currentNode.left, value);
        }else if (value > currentNode.value){
            currentNode.right = rDelete(currentNode.right, value);
        }else {
            if(currentNode.right == null && currentNode.left == null){
                return null;
            } else if (currentNode.right == null) {
                return currentNode.left;
            }else if (currentNode.left == null){
                return currentNode.right;
            }else {
                Node minNode = findMinNode(currentNode.right);
                currentNode.value = minNode.value;
                rDelete(currentNode.right, currentNode.value);
            }
        }
        return currentNode;
    }

    public Node findMinNode(Node node){
        while(node.left != null){
            node = node.left;
        }

        return node;
    }

}

class Node{
    public Node left;
    public Node right;
    public int value;

    Node(int value){
        this.value = value;
    }
}
