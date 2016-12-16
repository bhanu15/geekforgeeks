package com.bhanu.dp;

public class MaxSumCircularArray {

	public static int input[] = {8,-8,9,-9,10,-11,12};
	public static int maxSumArray(){
		int maxSum =0;
		int temp=0;
		
//		for(int j=0;j<2;j++){
			for(int i=0;i<input.length ;i++){
				temp = Math.max(temp , input[i]);
				maxSum = Math.max(maxSum , temp);
			}
//		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		System.out.println(maxSumArray());
	}
}
