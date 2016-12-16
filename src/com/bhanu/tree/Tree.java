package com.bhanu.tree;

import java.util.Stack;

public class Tree<T extends Comparable<T>> {
	Node<T> head;

	public Tree() {

	}

	public static class Node<T extends Comparable<T>> implements Comparable<T> {
		T data;
		Node<T> left, right;

		public Node(T data) {
			this.data = data;
			left = right = null;
		}

		public int compareTo(T data) {
			return this.data.compareTo(data);
		}

		public boolean hasLeft() {
			boolean flag = false;
			flag = (this.left != null) ? true : false;
			return flag;
		}

		public boolean hasRight() {
			boolean flag = false;
			flag = (this.right != null) ? true : false;
			return flag;
		}

		public boolean isLeafNode() {
			return ((this.left == null) && (this.right == null)) ? true : false;
		}

		public String toString() {
			return data.toString();
		}
	}

	public void add(T data) {
		add(head, data);
	}

	private void add(Node<T> head, T data) {
		Node<T> temp = head;
		if (temp == null) {
			this.head = new Node<T>(data);
		} else {
			if (temp.compareTo(data) > 0) {
				if (temp.hasLeft()) {

					add(temp.left, data);
				} else {
					temp.left = new Node<T>(data);
				}
			} else {
				if (temp.hasRight()) {
					add(temp.right, data);
				} else {
					temp.right = new Node<T>(data);
				}
			}
		}
	}

	private void display(Node<T> head) {
		if (head != null) {
			display(head.left);
			System.out.print(" " + head + " ");
			display(head.right);
		}
	}

	public void display() {
		display(head);
	}

	public void path() {
		Stack<T> stack = new Stack<T>();
		path(stack, head);
	}

	private void path(Stack<T> stack, Node<T> head) {
		if (head == null) {
			return;
		}
		if (head.isLeafNode()) {
			stack.add(head.data);
			System.out.println(stack);
			stack.pop();
		} else {
			stack.add(head.data);
			path(stack, head.left);
			path(stack, head.right);
			stack.pop();
		}
	}

	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		tree.add(1);
		tree.add(10);
		tree.add(2);
		tree.add(5);
		tree.add(15);
		 tree.add(21);
		// tree.add(10);
		// tree.add(2);
		// tree.add(5);
		System.out.println("\n ------- ");
		tree.display();
		System.out.println("\n ------- ");
		tree.path();
	}
}
