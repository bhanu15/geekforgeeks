package com.bhanu.test.tree;

import java.util.*;

public class Tree<T extends Comparable<T>> {

	private Stack<T> stack = new Stack<T>();
	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public void add(T data) {
		add(head, data);
	}

	public void add(Node<T> head, T data) {
		Node<T> temp = head;
		if (temp == null) {
			this.head = new Node<T>(data);
			return;
		}
		
		if(temp.compareTo(data) ==0){
			return;
		}
		if (temp.compareTo(data) > 0) {
			if (temp.hasLeft()) {
				add(temp.getLeft(), data);
			} else {
				temp.setLeft(new Node<T>(data));
			}
		} else {
			if (temp.hasRight()) {
				add(temp.getRight(), data);
			} else {
				temp.setRight(new Node<T>(data));
			}

		}
	}

	public void traverse() {
		traverse(head);
	}

	public void traverse(Node<T> head) {
		Node<T> temp = head;
		if (temp == null) {
			return;
		}
		traverse(temp.getLeft());
		stack.push(temp.getData());
		// System.out.println(temp.getData());
		traverse(temp.getRight());
	}

	public T getKthLargest(int k) {

		traverse(getHead());

		if (k > stack.size() || stack.isEmpty()) {
			return null;
		}

		for (int i = 1; i < stack.size() - k; i++) {
			stack.pop();
		}
		return stack.pop();
	}

	private void rootToLeafPath(Node<T> head, Stack<Node<T>> stack) {
		if (head == null) {
			return;
		}

		stack.add(head);

		if (head.isLeafNode()) {
			System.out.println(stack);
		}

		rootToLeafPath(head.getLeft(), stack);
		rootToLeafPath(head.getRight(), stack);
		stack.pop();
	}

	public void rootToLeafPath(Node<T> head) {
		Stack<Node<T>> stack = new Stack<Node<T>>();
		rootToLeafPath(head, stack);
	}

	public boolean hasPathSum(Node<T> head, int sum) {
		if (head == null) {
			return false;
		}
		if (head.isLeafNode() && sum == (Integer) head.data) {
			return true;
		}
		if (head.isLeafNode()) {
			return false;
		}
		sum = sum - (Integer) head.data;

		return (hasPathSum(head.getLeft(), sum) || hasPathSum(head.getRight(),
				sum));
	}

	public int height(Node<T> head){
		if(head == null){
			return 0;
		}
		return 1+max(height(head.getLeft()), height(head.getRight()));
	}
	public int maxPathSum(Node<T> head){
		if(head == null){
			return 0;
		}
		if(head.isLeafNode()){
			return (Integer)head.data;
		}
		return (Integer)head.data + max( maxPathSum(head.getLeft()) ,maxPathSum(head.getRight())) ;
	}
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public int diameterOfTree(Node<T> head){
		if(head == null){
			return 0;
		}
		int left = height(head.getLeft());
		System.out.println("head  "+head.getLeft() +" height "+left);
		int right = height(head.getRight());
		System.out.println("head  "+head.getRight() +" height "+right);
		int diameter = left+ right+1;
		System.out.println("Diamter at head ::" +head+" :: "+diameter);
		return max(diameter , max(diameterOfTree(head.getLeft()), diameterOfTree(head.getRight()) ));
	}
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		tree.add(10);
		tree.add(8);
		tree.add(5);
		tree.add(9);
		tree.add(30);
		tree.add(20);
		tree.add(40);
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(9);
		Node<Integer> head= tree.getHead();
		// System.out.println(tree.getKthLargest(3));
		// tree.rootToLeafPath(tree.getHead());
//		System.out.println(tree.hasPathSum(tree.getHead(), 80));
//		System.out.println(tree.maxPathSum(tree.getHead()));
//		System.out.println(tree.height(head));
		System.out.println(tree.diameterOfTree(head));
	}
}
