package com.bhanu.test;

public class Test {

	private Node head;

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node temp = head;

		while (temp.hasNext()) {
			temp = temp.next();
		}
		temp.setNext(new Node(data));
	}

	public void display() {
		Node temp = head;
		if (temp == null) {
			return;
		}
		while (temp.hasNext()) {
			System.out.println(temp);
			temp = temp.next();
		}
		System.out.println(temp);
	}

	public Node getHead() {
		return head;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		System.out.println("------------ Before ----------");
		test.display();
		System.out.println("------------ After -----------");
		test.display();
		test.swapList(test.getHead());
		test.display();

	}

	public Node swapList(Node head) {
		Node temp = head;
		System.out.println("");
		Node temp1 = null;
		Node temp2 = null;
		Node temp3 = null;
		boolean flag = true;
		while (temp != null && temp.hasNext()) {
			if (flag) {
				this.head = temp.next();
				flag = false;
			}
			temp1 = temp;
			temp2 = temp.next();
			if (temp2.hasNext()) {

				temp1.setNext(temp2.next());
			} else {
				temp1.setNext(null);
			}
			if (!flag && temp3 != null) {

				temp3.setNext(temp2);
			}
			temp2.setNext(temp);
			temp3 = temp;
			temp = temp.next();
		}

		return this.head;
	}
}
