package com.bhanu.dp;

public class EditDistance {

	public static int max = 9999;
	
	public static String string1 ="Saturday";
	public static String string2 = "Sunday";
	public static void main(String[] args) {
		System.out.println(minEditDistance(string2.length()-1 , string1.length()-1));
		System.out.println(minDistanceDP(string1.length() , string2.length()));
	}
	
	
	// recurse solution
	
	public static int minEditDistance(int start1 , int start2){
		if(start1 <0 || start2 <0 ){
			return max;
		}
		
		if(start1 ==0){
			return start2;
		}
		
		if(start2 ==0){
			return start1;
		}
		
		if(string2.charAt(start1) == string1.charAt(start2)){
			return minEditDistance(start1-1, start2-1);
		}
		return min(minEditDistance(start1-1, start2-1) ,minEditDistance(start1-1, start2) ,minEditDistance(start1, start2-1))+1;
	}
	
	public static int min(int a , int b){
		return a>b?b:a;
	}
	
	public static int min(int a , int b , int c){
		return min(min(a,b) ,min(a,c));
	}
	
	
	// dp solution
	
	public static int minDistanceDP(int length1 , int length2){
		
		int soln[][] = new int [length1+1][length2+1];
		
		for(int i=0;i<length2+1 ;i++)
			soln[0][i] = i;
		
		for(int j=0;j<length1+1 ;j++)
			soln[j][0] = j;
		
		for(int i=1;i<=length1;i++){
			for(int j=1;j<=length2;j++){
				
				if(string1.charAt(i-1) == string2.charAt(j-1)){
					soln[i][j] = soln[i-1][j-1];
				}
				else{
					soln[i][j] = min(soln[i-1][j-1] , soln[i][j-1] , soln[i-1][j])+1;
				}
			}
		}
		
		System.out.println(" ###############  ");
		
		for(int i=0;i<= length1 ;i++){
			for(int j=0 ;j<length2 ;j++){
				System.out.print(" "+soln[i][j]+" ");
			}
			System.out.println();
		}
		return soln[length1][length2];
	}
}
