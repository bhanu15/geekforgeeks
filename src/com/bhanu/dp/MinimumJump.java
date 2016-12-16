package com.bhanu.dp;

public class MinimumJump {

	public static int max = 999999;
	static int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	static int length = arr.length;

	/*
	 * recursive approach 
	 */
	public static int minJumps(int start, int total) {
		if (total < 0) {
			return 0;
		}
		int min = max;

		if (start >= length || start + arr[start] >= length) {
			return max;
		}
		for (int i = start; i < start + arr[start]; i++) {
			if (arr[i] == 0) {
				min = Math.min(min, max);
				continue;
			}
			min = Math.min(min, minJumps(arr[i], total - arr[i]));
		}
		return min + 1;
	}
	
	/**
	 * Dynamic approach
	 * @param args
	 */
	
	public static int minJumpsDP(){
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(minJumps(0, length-1));
	}
}
