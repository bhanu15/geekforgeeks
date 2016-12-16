package com.bhanu.dp;

public class Test {

	public static void main(String[] args) {
		
	}
	public static int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if(A.length ==0){
            return 0;
        }
        int increasingLength =  longestIncreasingSeqLength(A);
        int decreasingLength = longestIncreasingSeqLength(reverseArr(A));
        return max(increasingLength ,decreasingLength );
        

    }
    
    public static int max(int a , int b){
        return a>b?a:b;
    }
    
    public static int[] reverseArr(int arr[]){
        for(int i=0, j= arr.length-1; i<=j;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    
    public static int longestIncreasingSeqLength(int arr[]){
        int tempIncreasing =1, tempDecresing =1, maxLength=1;
        for(int i=1 ;i< arr.length ;i++){
            if(arr[i] > arr[i-1]){
                tempIncreasing = tempIncreasing+1;
            }
            if(tempIncreasing > maxLength){
                maxLength = tempIncreasing;
            }else{
                tempIncreasing =1;
            }
        }
        return maxLength;
    }
}
