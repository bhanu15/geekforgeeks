package com.bhanu.test.tree;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeTopView<T extends Comparable<T>> {
    Node<T> head;
    int maxLevel =-1;
    Map<Integer , T> map = new TreeMap<Integer , T>();
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(1);
        head.setLeft(new Node<Integer>(11));
        head.setRight(new Node<Integer>(2));
        head.getRight().setRight(new Node<Integer>(111));
        head.getRight().setLeft(new Node<Integer>(112));
        TreeTopView<Integer> tree = new TreeTopView<Integer>();
        tree.head = head;
//        tree.traversal(head , 0);
//        tree.printTopView();
        tree.printLeftViewTree(head , 0);
    }
    
    public void traversal(Node<T> head , int index){
        if(head!= null){
            traversal(head.getLeft() , index-1);
//            System.out.println(head+"index : "+index);
            addToMap(head.getData() , index);
            traversal(head.getRight() , index+1);
        }
    }
    
    public void addToMap(T data  , int index){
        if(!map.containsKey(index)){
            map.put(index, data);
        }
    }
    
    public void printTopView(){
        Iterator<Map.Entry<Integer, T>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, T> entry = iterator.next();
            System.out.println("Top View :: "+entry.getValue());
        }
    }
    
    public void printLeftViewTree(Node<T> head , int level){
    	if(head == null){
    		return;
    	}
    	if(level >maxLevel ){
    		maxLevel = level;
    		System.out.println(head);
    	}
    	printLeftViewTree(head.getRight() , level+1);
    	printLeftViewTree(head.getLeft() , level+1);
    }
}
