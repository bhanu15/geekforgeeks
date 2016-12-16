package com.bhanu.arrays;

public class NextGreaterElement {

	public static int input[] = {11, 13, 21, 3};
	public static void nextGreaterElement(){
		int length = input.length;
		int max = input[length-1];
		
		for(int i = length-1 ;i>=0;i--){
			if(input[i] >= max){
				System.out.println("element : "+input[i]+"-1");
				max = Math.max(input[i] , max);
				continue;
			}
//			if(i == length-1){
//				System.out.println("element : "+input[i] +" Max "+max);
//				continue;				
//			}

			if(input[i]< input[i+1]){
				System.out.println("element : "+input[i] +" Max "+input[i+1]);
				continue;
			}
			if(input[i]< max){
				System.out.println("element : "+input[i] +" Max "+max);
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		nextGreaterElement();
	}
}
