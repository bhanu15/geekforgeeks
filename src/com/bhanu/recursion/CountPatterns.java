package com.bhanu.recursion;

import java.util.*;
public class CountPatterns {

	public static int input[] = {2,3};
	public static boolean isValid(int start , int end){
		if(start >=1 && start<=2 && end>=1 && end<=7){
			return true;
		}
		return false;
	}
	
	public static int count(int start , int end){
		if(start >end || end <0){
			return 0;
		}
		if(isValid(input[start] , input[end])){
			return Math.max(count(start , end -1) , count(start +1 , end ))+1;
		}
		return Math.max(count(start , end -1) , count(start +1 , end ));
	}
	
	public static void main(String[] args) {
		System.out.println(count(0,1));
	}
}
