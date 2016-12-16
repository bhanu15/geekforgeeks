package com.bhanu.test.tree;

public class Delete {

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
	public static Node1 delete(Node1 head){
		if(head != null){
			Node1 left = delete(head.left);
			Node1 right = delete(head.right);
			if(left == null && right == null){
				System.out.println("Deleting "+head);
				head = null;
			}
			
			return head;
		}
		return head;
	}
	
	public static void main(String[] args) {
		Node1 head = insert(null,1);
		insert(head,11);
		insert(head,15);
		insert(head , 200);
		head = delete(head);
		System.out.println(head);
		
	}
}
