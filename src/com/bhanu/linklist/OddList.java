package com.bhanu.linklist;

public class OddList {
	LinkList.Node  head , oddHead;
	
	OddList(LinkList.Node head){
		this.head = head;
	}
	
	public void createOddList(){
		LinkList.Node  temp = head;
		while(temp.hasNext()){
			if(temp.isOdd()){
				add(temp);
			}
			temp = temp.next();
		}
		if(temp.isOdd()){
			add(temp);	
		}
	}
	
	private void add(LinkList.Node data){
		LinkList.Node temp = oddHead;
		if(temp == null){
			temp = new LinkList.Node(data.data);
			this.oddHead = temp;
		}
		while(temp.hasNext()){
			temp = temp.next();
		}
		temp.next = new LinkList.Node(data.data);
	}
	
	public void display(){
		LinkList.Node temp = oddHead;
		
		while(temp.hasNext()){
			System.out.print(" "+temp);
			temp = temp.next();
		}
		System.out.print(" "+temp);
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
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		linkList.display();
		System.out.println("\n------------");
		LinkList.Node head= linkList.getHead();
		OddList oddList = new OddList(head);
		oddList.createOddList();
		oddList.display();
		System.out.println("\n again printing original");
		linkList.display();
		System.out.println("\n------------");
		oddList.display();
	}
}
