package com.jewel.hashtables.implementation;

public class Main {


    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>(4);
        hashTable.set("first", 20);
        hashTable.set("second", 30);
        hashTable.set("third", 40);
        hashTable.set("forth", 50);
        hashTable.set("five", 60);

        hashTable.printHashTable();
        System.out.println(hashTable.get("first"));
    }
}
