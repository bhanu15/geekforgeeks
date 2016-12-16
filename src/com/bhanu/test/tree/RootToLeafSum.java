package com.bhanu.test.tree;

public class RootToLeafSum {

	public static Node1 insert(Node1 head, int data){
		if(head == null){
			head = new Node1(data);
			return head;
		}
		if(head.data >=data){
			head.left = insert(head.left , data);
		}else
		{
			head.right = insert(head.right , data);
		}
		return head;
	}
	public static Node1 rootToLeafSum(Node1 head, int sum){
		if(head == null){
			return null;
		}
		
		if(rootToLeafSum(head.left , sum +head.data) == null){
			System.out.println(sum);
		}
		if(rootToLeafSum(head.right , sum +head.data) == null){
			System.out.println(sum);
		}
		return head;
	}
}
