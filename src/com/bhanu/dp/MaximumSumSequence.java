package com.bhanu.dp;

/**
 * 
 * @author bhanu.prakash
 * this is for finding the maximum sum of the contiguous sequence. 
 */
public class MaximumSumSequence {

	public static void main(String[] args) {
		int arr[] = {-1,-1,-1,-1,-1,-100};
		MaximumSumSequence maxSumSequence = new MaximumSumSequence();
		System.out.println(maxSumSequence.maxSum(arr));
	}
	
	
	public int maxSum(int arr[]){
		
		int max =arr[0];
		int temp=0;
		int end  = 0;
		int start =0;
		int tempStart = start;

		for(int i=0 ;i<arr.length ;i++){
			temp = temp + arr[i];
			temp = max(temp, arr[i]);
			
			if(temp == arr[i]){
				tempStart = i;
			}

			if(temp > max){
				max  = temp;
				end = i;
				start = tempStart;
			}
		}
		
		System.out.println("Start :: "+start + "End :: "+end);
		return max;
	}
	
	public int max(int a , int b){
		return a>=b? a :b;
	}
}
