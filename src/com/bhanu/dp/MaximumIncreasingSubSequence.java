package com.bhanu.dp;

public class MaximumIncreasingSubSequence {

	public static void main(String[] args) {
	
		int array[] = {-5, -3, 0, 10 ,4,3,5,-1,6,10};
		System.out.println(maxIncreasingSubSequence(array));
	}
	
	public static int maxIncreasingSubSequence (int arr[]){
		int maxLength = 1;
		int maxLengthArr [] = new int[arr.length];
		
		for(int i=0;i< arr.length ;i++){
			maxLengthArr[i] = maxLength;
		}
		
		for(int i=1; i< arr.length ;i++){
			for(int j=0; j<i;j++){
				if(arr[i] > arr[j]){
					maxLengthArr[i] = max(maxLengthArr[i] , maxLengthArr[j]+1);
					maxLength = max(maxLength , maxLengthArr[i]);
				}
			}
		}
		
		return maxLength;
	}
	
	public static int max(int a , int b){
		return a>b ?a :b;
	}
}
