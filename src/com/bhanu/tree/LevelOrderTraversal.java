package com.bhanu.tree;

import java.util.ArrayDeque;

public class LevelOrderTraversal {

	Node head;
	
	LevelOrderTraversal(Node head){
		this.head  = head;
	}
	public void levelOrderTraversal(){
		ArrayDeque<Node> stackA = new ArrayDeque<>();
		stackA.push(head);
		ArrayDeque<Node> stackB = new ArrayDeque<>();
		
 		
		while(!(stackA.isEmpty() && stackB.isEmpty())){
		while(!stackA.isEmpty()){
			Node temp = stackA.pop();
			System.out.print(temp);
			
			if(temp.left!= null){
				stackB.push(temp.left);
			}
			if(temp.right != null){
				stackB.push(temp.right);
			}
		}
		System.out.println();
		while(!stackB.isEmpty()){
			Node temp = stackB.pop();
			System.out.print(temp);
			
			if(temp.left!= null){
				stackA.push(temp.left);
			}
			if(temp.right != null){
				stackA.push(temp.right);
			}
		}
		
		System.out.println();
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		
		head.right.left = new Node(6);
		head.right.right = new Node(7);
		
		LevelOrderTraversal ll = new LevelOrderTraversal(head);
		ll.levelOrderTraversal();
	}
	
}
