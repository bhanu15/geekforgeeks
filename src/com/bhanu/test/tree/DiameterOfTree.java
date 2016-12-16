package com.bhanu.test.tree;

public class DiameterOfTree {
	
	public static int height(Node1 head){
		if(head == null){
			return 0;
		}
		
		return Math.max(height(head.left) ,height(head.right))+1;
	}
	
	public static int diameter(Node1  head){
		if(head == null){
			return 0;
		}
		int left = height(head.left);
		int right = height(head.right);
		int rightDiameter = diameter(head.right);
		int leftDiameter = diameter(head.left);
		return Math.max(Math.max(rightDiameter , leftDiameter) , right+left +1);
	}
}
