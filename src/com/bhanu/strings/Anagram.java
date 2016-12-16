package com.bhanu.strings;

public class Anagram {

	 public static boolean anagram(String s, String t) {
		 // write your code here
		 int xor =0;
		 for(char c : s.toCharArray()){
		     xor ^= (int)c;
		 }
		 
		 for(char c1 : t.toCharArray()){
		     xor ^= (int)c1;
		 }
		 
		 System.out.println(xor);
		 if((xor^0) == 0){
		     return true;
		 }
		 return false;
		 }
	 
	 public static void main(String[] args) {
		String s = "az";
		String s2 = "by";
//		System.out.println(s^s2);
		System.out.println(anagram(s,s2));
		int a = (int)'a';
		int b = (int)'b';
		int y = (int)'y';
		int z = (int)'z';
		
		System.out.println(a +" B "+b+" Y"+y+" Z "+z);
		System.out.println("A XOR Z"+(7^11));
		System.out.println("A XOR Z"+(8^10));
	}
}
