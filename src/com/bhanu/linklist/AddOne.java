package com.bhanu.linklist;

// 1999 +1 == 2000
public class AddOne {

	public static int add(Node head , int carry){
		if(head == null || carry ==0){
			return carry;
		}
		carry = add(head.next , carry);
		int temp = head.data +carry;
		head.data = temp%10;
		return temp/10;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(9);
		head.next.next = new Node(9);
		head.next.next.next = new Node(9);
		
		add(head, 10);
		while(head !=null){
			System.out.println(head.data);
			head = head.next;
		}
	}
}
