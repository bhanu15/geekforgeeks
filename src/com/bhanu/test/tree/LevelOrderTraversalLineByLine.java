package com.bhanu.test.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

	public static Node1 insert(Node1 head, int data) {
		if (head == null) {
			head = new Node1(data);
			return head;
		}
		if (head.data >= data) {
			head.left = insert(head.left, data);
		} else {
			head.right = insert(head.right, data);
		}

		return head;
	}

	public static void traverse(Node1 head) {
		if (head != null) {
			traverse(head.left);
			System.out.println(head);
			traverse(head.right);
		}
	}

	public static void levelOrderTraversal(Node1 head) {
		Queue<Node1> queue = new LinkedList<Node1>();
		Queue<Node1> queueNext = new LinkedList<Node1>();
		queue.add(head);
		while (true) {
			if (queueNext.isEmpty() && queue.isEmpty()) {
				break;
			}
			while (!queue.isEmpty()) {
				Node1 head1 = queue.poll();
				System.out.print(head1 + " ");
				if (head1.left != null) {
					queueNext.add(head1.left);
				}
				if (head1.right != null) {
					queueNext.add(head1.right);
				}
			}
			System.out.println("\n");
			{
				while (!queueNext.isEmpty()) {
					Node1 head2 = queueNext.poll();
					System.out.print(head2);
					if (head2.left != null) {
						queue.add(head2.left);
					}
					if (head2.right != null) {
						queue.add(head2.right);
					}
				}
			}
			System.out.println("\n");
		}
	}

	public static void printNodeAtKthLevel(Node1 head, int current, int k) {

		if (head != null && current <= k) {
			if (current == k) {
				System.out.print(head);
			}
			printNodeAtKthLevel(head.left, current + 1, k);
			printNodeAtKthLevel(head.right, current + 1, k);
		}
	}

	public static void rootToLeafSum(Node1 head, int sum) {
		if (head == null) {
		}
		if(head != null){
			sum = sum+head.data;
		if (head.left == null && head.right == null) {
			System.out.println(sum);
		}
		rootToLeafSum(head.left, sum );
		rootToLeafSum(head.right, sum );
		}
	}

	public static void main(String[] args) {
		Node1 head = insert(null, 1);
		insert(head, 1);
		insert(head, 15);
		insert(head, 21);
		insert(head, 10);
		insert(head, -1);
		insert(head, 5);
		insert(head, 100);
		// traverse(head);
		// System.out.println(" levelOrder traversal");
		// levelOrderTraversal(head);
		// System.out.println("Nodes at kth distance");
		// System.out.println(head);
		// printNodeAtKthLevel(head , 0 , 2);
		rootToLeafSum(head, 0);
		rootToLeafPath(head, "");
		System.out.println(diameter(head));
		System.out.println(size(head));
	}
	public static void rootToLeafPath(Node1 head , String path){
		if(head!= null){
			path = path +head;
			if(head.left == null && head.right == null){
				System.out.println(path);
			}else{
				rootToLeafPath(head.left , path);
				rootToLeafPath(head.right , path);
			}
		}
	}
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
	
	public static int size(Node1 head){
		if(head == null){
			return 0;
		}
		int left = size(head.left);
		int right = size(head.right);
				
		return left+right+1;
	}
	
	
}
