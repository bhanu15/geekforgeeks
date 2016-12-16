package com.bhanu.dp;


/*
 * arr[i] 0<=i<n , n = size of array
 * 
 * M(i) = max{M(i-1)* arr[i] , m(i-1)*arr[i] , arr[i]} 0<=i<n;
 * m(i) = max{M(i-1)* arr[i] , m(i-1)*arr[i] , arr[i]} 0<=i<n;
 * 
 * maxProduct = max(M(i)) , 0<=i<n
 * base case 
 * if n ==1 
 * maxProduct = arr[i]
 * otherwise 
 * m[0]=1, M[0] =1 , maxProduct = arr[0]
 */
public class MaximumProduct {

	
	public static void main(String[] args) {
		int arr[] = {-1,2,3,5,-5,-3};
		System.out.println(maxProduct(arr));
	}
	public static int maxProduct(int arr[]){
		int minN =1;
		int maxP =1;
		if(arr.length ==0){
			return -9999;
		}
		if(arr.length ==1){
			return arr[0];
		}
		int productMax = arr[0];
		for(int i: arr){
			int tempP = max(maxP*i , minN*i , i);
			int tempN = min(maxP*i , minN*i , i);
			maxP = tempP;
			minN = tempN;
			productMax= max(productMax , maxP);
		}
		return productMax;
	}
	
	public static int min(int a , int b){
		return a>b? b:a;
	}
	
	public static int max(int a , int b){
		return a>b ? a:b;
	}

	public static int min(int a , int b , int c){
		return min(min(a,b) , min(b,c));
	}
	
	public static int max(int a , int b , int c){
		return max(max(a,b) , max(a,c));
	}
}
