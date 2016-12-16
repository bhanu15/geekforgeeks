package com.bhanu.backtrack;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		list.addAll(stack);
		System.out.println(list);
	}
}
