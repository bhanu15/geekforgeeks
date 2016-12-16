package com.bhanu.test.tree;

public class Amplitude {

	public static int amplitude(Node1 head){
		if(head == null){
			return -99999;
		}
		int left = rootToLeafSum(head.left);
		int right = rootToLeafSum(head.right);
		int leftAmplitude = amplitude(head.left);
		int rightAmplitude = amplitude(head.right);
		
		return Math.max(head.data +right +left, Math.max(leftAmplitude , rightAmplitude));
	}
	
	public static int rootToLeafSum(Node1 head){
		if(head == null){
			return 0;
		}
		
		int left = rootToLeafSum(head.left);
		int right = rootToLeafSum(head.right);
		int temp = Math.max(left , right);
		return Math.max(head.data , head.data +temp);
	}
	public static void main(String[] args) {
		Node1 head = new Node1(10);
		head.right = new Node1(10);
		head.right.right = new Node1(-25);
		head.right.right.right = new Node1(3);
		head.right.right.left = new Node1(400);
		head.left = new Node1(2);
		head.left.left = new Node1(20);
		head.left.right = new Node1(1);
		System.out.println(amplitude(head));
		
	}
}
