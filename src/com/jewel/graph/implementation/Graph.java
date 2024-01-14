package com.jewel.graph.implementation;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String , ArrayList<String>> list;

    Graph(){
        list = new HashMap<>();
    }

    public void printGraph(){
        System.out.println(list);
    }

    public boolean addVertex(String value){
        if(list.get(value) == null){
            list.put(value, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2){
        if(list.get(vertex1) != null && list.get(vertex2) != null){
            list.get(vertex1).add(vertex2);
            list.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(list.get(vertex1) != null && list.get(vertex2) != null){
            list.get(vertex1).remove(vertex2);
            list.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(list.get(vertex) != null ){
            ArrayList<String> vertices = list.get(vertex);
            for(String ver: vertices){
                list.get(ver).remove(vertex);
            }
            list.remove(vertex);
            return true;
        }
        return false;
    }
}
