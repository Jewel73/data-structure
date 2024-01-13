package com.jewel.tree.implementation;


public class BinarySearchTree {
        Node root;

        BinarySearchTree(int value){
            Node node = new Node(value);
            root = node;
        }

        public boolean contain(int value){
            if(root == null) {
                return false;
            }

            Node temp = root;
            while(temp != null){
                if(value > temp.value) temp = temp.right;
                else if(value < temp.value) temp = temp.left;
                else return true;
            }
            return false;
        }

        public boolean insert(int value){
            Node newNode = new Node(value);
            if(root == null) {
                root = newNode;
                return true;
            }

            Node temp = root;
            while(true){
                if(newNode.value > temp.value){
                    if(temp.right != null){
                        temp = temp.right;
                    }else {
                        temp.right = newNode;
                        return true;
                    }

                }else if(newNode.value < temp.value){
                    if(temp.left != null){
                        temp = temp.left;
                    }else{
                        temp.left = newNode;
                        return true;
                    }
                }else{
                    return false;
                }
            }

        }

        public void getRoot(){
            System.out.println(" Root : " + root.value);
        }

}

class Node{
    Node left;
    Node right;
    int value;

    Node(int value){
        this.value = value;
    }

}