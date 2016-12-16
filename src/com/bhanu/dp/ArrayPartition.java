package com.bhanu.dp;

public class ArrayPartition {

	public static boolean checkBalance(int arr[] , int start , int end){
		int sum =0;
		for(int i=start ; i<= end ;i++){
			sum +=arr[i];
		}
		
		int left = arr[start];
		for(int i= start+1; i<= end ;i++){
			int right = sum - left;
			if(right == left){
				return true;
			}
			left = left + arr[i];
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {7,1,2,3,3,2,1,9};
		
		System.out.println(isBalanced(arr, 0,7));
 	}
	
	
	public static boolean isBalanced( int arr[] ,int start , int end){
		if(start > end){
			return false;
		}
		 if(checkBalance(arr, start , end)){
			 System.out.println("start"+start);
			 System.out.println("end "+end);
			 return true;
		 };
		 
		return isBalanced(arr, start , end -1)|| isBalanced(arr, start+1 , end ); 
	}
}
