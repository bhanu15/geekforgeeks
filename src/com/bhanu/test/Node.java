package com.bhanu.test;

public class Node {

	private int data ;
	private Node next;
	
	public Node(int data){
		this.data = data;
	}
	
	
	public Node next(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	public boolean hasNext(){
		return next != null;
	}
	
	public String toString(){
		return ""+data+"";
	}
}
