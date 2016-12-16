package com.bhanu.stack;

/**
 * this is using O(N) space 
 */
import java.util.*;
public class SpecialStack {

	static public int size =0;
	public static Stack<Integer> stack = new Stack<Integer>();
	public static Stack<Integer> minStack = new Stack<Integer>();
	
	static public int getMin(){
		if(size ==0){
			return -99999;
		}
		return minStack.peek();
	}
	
	public static boolean isEmpty(){
		return size >0 ? false : true;
	}
	
	public static void push(int element){
		if(size ==0){
			stack.push(element);
			minStack.push(element);
			size++;
			return;
		}
		int tempMin = minStack.peek();
		if(element <= tempMin){
			minStack.push(element);
		}
		stack.push(element);
		size++;
	}
	
	public static void pop(){
		if(size ==0){
			return;
		}
		int temp = stack.pop();
		int tempMin = minStack.peek();
		if(tempMin == temp){
			minStack.pop();
		}
		size--;
	}
	public static int getSize(){
		return size;
	}
	
	public static void main(String[] args) {
//		push(18);
//		push(19);
//		push(29);
//		
//		push(15);
//		push(16);
//		pop();
//		pop();
////		pop();
//		System.out.println(getMin());
//		
//		Stack<Integer> s = new Stack<Integer>();
//		s.push(1);
//		s.push(1);
//		s.push(1);
//		s.push(1);
//		System.out.println(s);
		push(1);
		push(1);
		push(1);
		System.out.println(stack);
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(stack);
		
	}
	
}
