package com.bhanu.linklist;

/**
 * 
 * @author bhanu.prakash
 * 
 * @param <T>
 */
public class LinkList<T extends Integer> {
	public Node<T> head;

	public static class Node<T extends Integer> implements Comparable<T> {
		public T data;
		public Node<T> next;

		public Node(T data) {
			this.data = data;
			next = null;
		}

		public boolean hasNext() {
			return this.next == null ? false : true;
		}

		public Node<T> next() {
			return this.next;
		}

		public int compareTo(T data) {
			return this.data.compareTo(data);
		}

		public String toString() {
			return data.toString();
		}

		public boolean isOdd() {
			boolean flag= false;
			flag= data % 2 == 0 ? false : true;
			return flag;
		}
	}

	public void add(T data) {
		Node<T> temp = head;
		if (temp == null) {
			this.head = new Node<T>(data);
			return;
		}

		while (temp.hasNext()) {
			temp = temp.next();
		}
		temp.next = new Node<T>(data);
	}

	public void add(Node<T> head,T data) {
		Node<T> temp = head;
		if (temp == null) {
			this.head = new Node<T>(data);
			return;
		}

		while (temp.hasNext()) {
			temp = temp.next();
		}
		temp.next = new Node<T>(data);
	}
	
	public void display() {
		Node<T> temp = head;
		while (temp.hasNext()) {
			System.out.print(temp + " ");
			temp = temp.next();
		}
		System.out.print(temp + " ");
	}

	public int compareTo(T data1, T data2) {
		return new Node<T>(data1).compareTo(data2);
	}

	public static void main(String[] args) {
		LinkList<Integer> linkList = new LinkList<Integer>();
		System.out.println("Creating link List");

		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
//		LinkList.Node<Integer> odd =  linkList.oddList();
//		System.out.println("Printing LinkList");
		linkList.display();
		System.out.println("------------");
		linkList.display();
		System.out.println("---ODD---------");
		// System.out.println(linkList.compareTo(1,1));
		System.out.println(linkList);
	}
	
	public Node<T> getHead(){
		return head;
	}
	
	public String toString(){
		return head.toString();
	}
}