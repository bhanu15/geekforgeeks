package com.bhanu.permutation;

public class Permutation {
	StringBuffer string;
	Permutation(StringBuffer string){
		this.string = string;
	}
	public static void main(String[] args) {

		Permutation permu = new Permutation(new StringBuffer("abcd"));
		System.out.println(" Before :: "+permu.string);

		permu.permutation(0,4);
		
		System.out.println(" :: "+permu.string);
		permu.swap(0,1);
		permu.permutation(0,4);
		System.out.println(" :: "+permu.string);
		permu.swap(0,3);
		permu.permutation(0,4);
		permu.swap(0,3);
		System.out.println(" :: "+permu.string);
//		System.out.println();
//		permu.permutation(1,4);
//		permu.permutation(2,4);
//		permu.permutation(3,4);
//		permutation.swap(0,1);
//		System.out.println("After :: "+permutation.string);
		
	}
	
	void swap(int i , int j){
		char c = string.charAt(i);
		string.setCharAt(i, string.charAt(j));
		string.setCharAt(j, c);
	}
	
	public void permutation(int k , int length){
		if(k >length){
			return;
		}
		System.out.println(string);
		for(int i=k+1;i<length;i++){
			swap(k,i);
			permutation(i,length);
			swap(k,i);
		}
	}
	
	
}
