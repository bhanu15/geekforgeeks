package com.bhanu.linklist;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]= {-100,-1};
		System.out.println(maxContigeousSum(arr));
	}
	
	  public static int maxContigeousSum(int array[]){
	       
	       int maxSum =array[0];
	       int temp = 0;
	       
	       for(int i=0;i<array.length;i++){
	           if(array[i]+temp > maxSum){
	               maxSum = array[i]+temp;
	               temp = array[i]+temp;
	           }else{
	               if(array[i]+temp <array[i]){
	                   temp = array[i];
	                   if(maxSum<temp){
	                	   maxSum = temp;
	                   }
	               }else{
	                 temp = array[i]+temp;  
	               }
	           }
	       }
	       return maxSum;
	   }
}
