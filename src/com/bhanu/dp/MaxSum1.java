package com.bhanu.dp;

public class MaxSum1 {

	public static void main(String[] args) {
		int arr[] = {-2,0,0,2,-1,100};
		System.out.println(maxSum(arr));
	}
	
	public static int maxSum(int arr[]){
		int sum = arr[0];
		int temp =0;
		for(int i: arr){
			temp = Math.max(temp +i, i);
			sum = Math.max(temp , sum);
		}
		return sum;
	}
}
