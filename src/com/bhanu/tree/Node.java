package com.bhanu.tree;

public class Node {

	int data;
	Node left , right;
	public Node(int data){
		this.data = data;
		left = right = null;
	}
	
	public String toString (){
		return data+" ";
	}
}
