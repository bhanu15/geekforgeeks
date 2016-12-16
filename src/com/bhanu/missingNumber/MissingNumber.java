package com.bhanu.missingNumber;

public class MissingNumber {

	public static int missingNumer(int input[], int size){
		int naturalXor = 0;
		int missingSeqXor =0;
		
		for(int i=1;i<= size ;i++){
			naturalXor ^=i;
		}
		
		for(int i: input){
			missingSeqXor ^= missingSeqXor;
		}
		
		return (naturalXor ^ missingSeqXor);
	}
	
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,8};
		int length = array.length;
		System.out.println(missingNumer(array, length));
	}
}
