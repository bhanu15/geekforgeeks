package com.bhanu.backtrack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordBreak {

	public static Set<String> dictonary = new HashSet<String>();

	public static Set<String> result = new LinkedHashSet<String>();
	
//	public static String input = "I love india I LOVE INDIA";
	public static String input = "I";
	public static void main(String[] args) {
		dictonary.add("I");
//		dictonary.add("LOVE");
//		dictonary.add("INDIA");
//		dictonary.add("mobile");
//		dictonary.add("samsung");
//		dictonary.add("sam");
//		dictonary.add("sung");
//		dictonary.add("man");
//		dictonary.add("mango");
//		dictonary.add("icecream");
//		
//		dictonary.add("and");
//		dictonary.add("go");
//		dictonary.add("i");
//		dictonary.add("like");
//		dictonary.add("ice");
//		dictonary.add("cream");
		
		System.out.println(wordBreak(0, input.length()));
		for(String s : result){
			System.out.println(s);
		}
		
	}
	
	public static boolean wordBreak( int start , int end){
		
		if(start >= end){
			return false;
		}
		String input = WordBreak.input.substring(start, end);
		if(dictonary.contains(input)){
			result.add(input);
			return true;
		}
		
		return wordBreak( start , end-1) |wordBreak( start+1 , end)  ;
	}
}
