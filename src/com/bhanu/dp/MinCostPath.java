package com.bhanu.dp;

public class MinCostPath {

	public static int size =3;
	public static int maxVal = 10000;
	public static int cost[][]= new int[size][size];
	public static void main(String[] args) {
		size = 3;
		cost[0][0] = 1;
		cost[0][1] = 2;
		cost[0][2] = 3;
		
		cost[1][0] = 4;
		cost[1][1] = 8;
		cost[1][2] = 2;
			
		cost[2][0] = 1;
		cost[2][1] = 5;
		cost[2][2] = 3;
		
		System.out.println(minCostPath(2,2));
		
	}
	public static int minCostPath(int i , int j){
		if(i < 0 || j <0){
			return maxVal;
		} 
		if(i ==0 && j==0){
			return cost[i][j];
		}
		
		return cost[i][j] + min(minCostPath(i-1 , j-1) , min(minCostPath(i , j-1) , minCostPath(i-1 , j)));
	}
	
	public static int min(int a , int b){
		return a<b ? a: b;
	}
}
