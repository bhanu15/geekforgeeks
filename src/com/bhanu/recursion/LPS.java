package com.bhanu.recursion;

public class LPS {

	public static String input = "GEEKSFORGEEKS";
	public static String result = "";
	
	public static int lps(int start , int end){
		if(start ==end ){
			return 1;
		}
		if(start > end || end <0){
			return 0;
		}
		if(((Character)input.charAt(start)).equals((Character)input.charAt(end))){
			return 2+lps(start+1 , end-1);
		}
		return Math.max(lps(start+1 , end) , lps(start , end-1));
	}
	
	public static String lps1(int start , int end ){
		if(start ==end ){
			return String.valueOf(input.charAt(start)) ;
		}
		if(start > end || end <0){
			return "";
		}
		
		if(((Character)input.charAt(start)).equals((Character)input.charAt(end))){
			String str = String.valueOf(input.charAt(start)) ;
			
			return str  +lps1(start+1 , end-1 ) +str;
		}
		
		int length1 = lps1(start+1 , end ).length();
		int length2 = lps1(start , end-1 ).length();	
		return length1 >length2 ? lps1(start+1 , end ): lps1(start , end-1 ) ;
	}
	public static void main(String[] args) {
		System.out.println(lps(0, input.length()-1));
		System.out.println(lps1(0, input.length()-1 ));
	}
}
