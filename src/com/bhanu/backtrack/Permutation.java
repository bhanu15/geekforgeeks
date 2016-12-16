package com.bhanu.backtrack;

public class Permutation {

	public static StringBuilder input = new StringBuilder("ABCA");
	
	public static void permut(int index){
		if(index >input.length()){
			return;
		}

		if(index == input.length()){
			System.out.println(input);
		}
		for(int i=index ; i<input.length() ;i++){
			swap(index, i);
			permut(index+1);
			swap(index ,i);
		}
	}
	
	public static void swap(int i , int j){
		char c = input.charAt(i);
		input.setCharAt(i ,input.charAt(j));
		input.setCharAt(j , c);
	}
	public static void main(String[] args) {
		permut(0);
	}
}
