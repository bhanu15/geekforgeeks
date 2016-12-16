package com.bhanu.backtrack;

import java.util.Stack;

public class RootToNode {

	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) {
	
		Node head = new Node(4);
		head.left = new Node(10);
		head.left.left = new Node(50);
		head.left.right = new Node(150);
		
		head.right = new Node(14);
		head.right.left = new Node(24);
		display(head);
	}
	
	public static void display(Node head){
		if(head == null){
			return;
		}
		
		stack.push(head.data);

		if(head.left == null && head.right == null){
			System.out.println(stack);
			stack.pop();
			return;
		}
		display(head.left);
		display(head.right);
		stack.pop();
	}
	
	public static String stackToString(Stack<Integer> stack){
		String str = new String();
//		for(int i : stack){
//			str = str +i+"->";
//		}
		
		for(int i=0;i<stack.size()-1 ;i++){
			str = str +i+"->";
		}
		str = str+ stack.pop();
		return str;
	}
	
}
