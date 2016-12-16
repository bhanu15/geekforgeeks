package com.bhanu.arrays;

public class IndexOfZero {

	public static int[] input = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
	public static int getIndex(){
		int index =-1;
		int temp =0;
		int max=0;
		int count=0;
		for(int i=0;i<input.length;i++){
			temp = temp+input[i];
			if(temp > max){
				max = temp;
				continue;
			}
			if(input[i]==0 &&temp == max && count<1){
				temp++;
				max++;
				count++;
				index = i;
				continue;
			}
			if(count ==1){
				temp =0;
				count=0;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		System.out.println(getIndex());
	}
}
