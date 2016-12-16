package com.bhanu.dp;

public class LongestPalindromSeq {

	static String input = "NITIN";
	public static void main(String[] args) {
		System.out.println("Longest Palindromic sequence !!!");
		System.out.println(longestPalindromicSeq(0 , input.length() -1));
	}
	
	public static int longestPalindromicSeq(int start , int end){
		if(start > end){
			return 0;
		}
		Character startChar = input.charAt(start);
		Character endChar =  input.charAt(end);
		
		if(startChar.equals(endChar) && start == end){
			System.out.println(startChar);
			return 1;
		}
		
		if(startChar.equals(endChar) && start != end){
			System.out.println(startChar);
			return 2+ longestPalindromicSeq(start+1 , end-1);
		}
		
		return max(longestPalindromicSeq(start+1 , end) , longestPalindromicSeq(start , end -1));
	}
	
	public static int max(int a , int b){
		return a>b ? a:b;
	}
}
