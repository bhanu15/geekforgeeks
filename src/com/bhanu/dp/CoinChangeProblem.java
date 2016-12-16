package com.bhanu.dp;

public class CoinChangeProblem {

	public static int max = 999999;
	public static int coins[] = {1,2,3};
	public static int minNumberOfCoins(int n){
		if(n <0){
			return max;
		}
		if(n ==0){
			return 0;
		}
		int minCount = max;
		for(int i=0;i<coins.length ;i++){
			minCount = Math.min(minCount , minNumberOfCoins(n-coins[i]));
		}
		return minCount+1;
	}
	public static void main(String[] args) {
//		System.out.println(minNumberOfCoins(10));
		System.out.println(noOfWays(4));
	}
	
	public static int noOfWays(int n){
		if(n <0){
			return 0;
		}
		int count =0;
		if(n ==0){
			count =1;
		}
		for(int i=0;i<coins.length ;i++){
			if(n == coins[i]){
				count =1;
			}
		}
		for(int i=0;i<coins.length ;i++){
			count = count + noOfWays(n - coins[i]);
		}
		return count;
	}
}
