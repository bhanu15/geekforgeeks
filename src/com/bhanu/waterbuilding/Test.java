package com.bhanu.waterbuilding;

import java.util.Stack;

public class Test {

	static int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

	public static void main(String[] args) {
		System.out.println("Hello World");
		// arr = {2,0,5};
		System.out.println(waterContent(2, 0));
		Stack<Integer> stack = maxWaterContent(arr);
		System.out.println(stack);
		System.out.println(getWaterContent(stack));
	}

	public static Stack<Integer> maxWaterContent(int arr[]) {
		Stack<Integer> stack = new Stack<Integer>();

		// creating stack for spik elements ....

		for (int i = 0; i < arr.length; i++) {

			int next = i + 1;

			int previous = i - 1;
			if (stack.isEmpty()) {
				if (next < arr.length && arr[i] > arr[i + 1]) {
					stack.push(i);
				}
				continue;
			}
			if (next < arr.length && arr[i] > arr[previous]
					&& arr[i] > arr[next]) {
				stack.push(i);
			}
			if (arr[i] > arr[previous] && i == arr.length - 1) {
				stack.push(i);
			}
		}

		System.out.println(stack);

		return stack;
	}

	public static int getWaterContentMax(Stack<Integer> stack) {
		int start = 0;
		int previous = 0;
		if (stack.isEmpty()) {
			return 0;
		}

		int sum = 0;

		for (int i = 1; i < stack.size(); i++) {
			sum = max(waterContent(stack.get(i), stack.get(previous)),
					waterContent(stack.get(i), stack.get(start)));
			if (sum == waterContent(stack.get(i), stack.get(previous))) {
				start = previous;
			}
			previous = i;
		}
		return sum;
	}

	public static int getWaterContent(Stack<Integer> stack) {
		int previous = 0;
		if (stack.isEmpty()) {
			return 0;
		}

		int sum = 0;

		for (int i = 1; i < stack.size(); i++) {
			sum = waterContent(stack.get(i), stack.get(previous)) + sum;

			previous = i;
		}
		return sum;
	}

	public static int waterContent(int end, int start) {

		int minLevel = min(arr[start], arr[end]);
		int water = 0;
		for (int i = start + 1; i < end && start < end; i++) {
			water = water + minLevel - arr[i];
		}
		return water;
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	private static int min(int a, int b) {
		return a > b ? b : a;
	}
}
