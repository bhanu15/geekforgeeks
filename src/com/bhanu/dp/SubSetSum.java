package com.bhanu.dp;

public class SubSetSum {

	public static boolean isSubSetSum(int sum , int array[]){
		
		int size = array.length;
		boolean soln[][] = new boolean[size+1][sum+1];
		
		for(int i=0;i<=size ;i++){
			soln[i][0] =true;
		}
		
		for(int i=1;i<=sum ;i++){
			soln[0][i] =false;
		}
		
		
		for(int i=1;i<=size;i++){
			for(int j=1;j<=sum;j++){
				soln[i][j]= soln[i-1][j] || soln[i-1][j-array[i-1]];
			}
		}
		
		for(int i=0;i<=size;i++){
			for(int j=0;j<=sum;j++){
				System.out.print(" "+soln[i][j]);
			}
			System.out.println();
		}
		return soln[size][sum];
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		System.out.println(isSubSetSum(10,arr));
	}
}
