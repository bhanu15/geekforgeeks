package com.bhanu.dp;

public class MaxSumNoAdj {

	public static int input[] = {3, 2, 5 ,10, 7};
	public static int maxSum (){
		int sum =0;
		int temp[] = new int[input.length];
		for(int k=0;k<temp.length;k++){
			temp[k] = input[k];
		}
		if(input.length <3){
			return input[0]>input[1] ? input[0]:input[1];
		}
		for(int i=3;i<input.length ;i++){
			for(int j=i-3 ;j<i-1 ;j++){
				temp[i] = Math.max(temp[j]+input[i] , temp[i]);
				sum = Math.max(sum , temp[i]);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(maxSum());
	}
}
	