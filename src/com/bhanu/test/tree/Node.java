package com.bhanu.test.tree;

public class Node<T extends Comparable<T>> implements Comparable<T> {

	private Node<T> left , right;
	T data;
	
	public Node(T data){
		this.data = data;
		left = right;
	}
	
	@Override
	public int compareTo(T data) {
		return this.data.compareTo(data);
	}

	public boolean hasLeft(){
		return left != null;
	}
	
	public boolean hasRight(){
		return right != null;
	}
	
	public String toString(){
		return data.toString();
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public Node<T> getRight(){
		return right;
	}
	
	public Node<T> getLeft(){
		return left;
	}
	
	public boolean isLeafNode(){
		return (left == right && left== null);
	}
	public T getData(){
		return data;
	}
}
