package com.bhanu.xor;

public class Test {

	public static void main(String[] args) {
		int arr[] = {};
		System.out.println(firstMissingPositive(arr));
	}
	  public static  int firstMissingPositive(int[] A) {
	        // write your code here   
	        int length = A.length;
	        if(length <=1){
	            return 1;
	        }
	        int xor =0;	
	        for(int i:A){
	            if(i>0){
	                xor = xor^i;
	            }
	        }
	        
	        for(int i=1;i<= A.length+1;i++){
	            xor = xor^i;
	        }
	        
	        return xor;
	    }
}
