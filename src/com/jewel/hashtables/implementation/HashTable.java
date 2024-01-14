package com.jewel.hashtables.implementation;

import java.util.ArrayList;

public class HashTable <K, V>{
    private Node[] dataItems;

    HashTable(int size){
        dataItems = new Node[size];
    }

    public V get(K key){
        int index = hash((String) key);
        Node temp = dataItems[index];

        while (temp != null){
            if(temp.key == key) {
                return (V) temp.value;
            }
            temp = temp.next;
        }

        return null;
    }

    public boolean set(K key, V value){
        Node newNode = new Node<>(key, value);
        int index = hash((String) key);
        if(dataItems[index] == null) {
            dataItems[index] = newNode;
            return true;
        }
        Node temp = dataItems[index];
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return true;
    }

    private int hash(String key){
        int keySum = 0;
        char[] keyArray = key.toCharArray();
        for (char ch : keyArray){
            keySum = (keySum + ch * 23) % dataItems.length;
        }

        return keySum;
    }


    public void printHashTable(){
        ArrayList<String> list = new ArrayList<>();

        for(int i =0; i <dataItems.length; i++){
            Node temp = dataItems[i];
            while (temp != null){
                list.add((String) temp.key);
                temp = temp.next;
            }
        }

        for(String key: list){
            System.out.println("key: "+ key);
        }
    }

}

class Node<K, V>{
    K key;
    V value;
    Node next;

    Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}