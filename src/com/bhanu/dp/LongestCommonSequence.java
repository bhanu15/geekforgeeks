package com.bhanu.dp;

public class LongestCommonSequence {

	public static String input1 = "ABCDGH";
	public static String input2 = "AEDFHR";
	public static void main(String[] args) {
		System.out.println(longestCommonSequence(0,0));
	}
	
	public static int longestCommonSequence(int length1, int length2){
		if(length1 >= input1.length() || length2 >= input2.length()){
			return 0;
		}
		Character input1Char = input1.charAt(length1);
		Character input2Char = input2.charAt(length2);
		if(input1Char.equals(input2Char)){
			System.out.println(input2Char);
			return 1+longestCommonSequence(length1+1 , length2+1);
		}
		return max(longestCommonSequence(length1 , length2+1) ,longestCommonSequence(length1+1 , length2));
	}
	
	public static int max(int a , int b){
		return a>b ? a:b;
	}
}
