package com.bhanu.dp;

public class EggDropping {

	public static int countAttempts(int start , int end ,int k){
		if(start < end){
			int mid = (start+end)/2;
			if(mid > k){
				start = mid+1;
			}
			if(mid < k){
				end = mid;
			}
			if(mid ==k){
				return 1;
			}
			return countAttempts(start , end , k)+1;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(countAttempts(1,36,2));
	}
}
