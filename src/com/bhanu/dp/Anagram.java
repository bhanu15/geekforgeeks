package com.bhanu.dp;

import java.util.Arrays;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
	String s = new String("hello World");

	List<String> ll = new LinkedList<String>();
	List<String> l = new LinkedList<String>();
	ll.add("1");
	l.add("b");
	ll.addAll(l);
	System.out.println(ll);
	
	}
	
	public static String sortString (String str){
		String strArr[] = str.split("");
		Arrays.sort(strArr);
		String s = new String();
		for(String s1: strArr){
			s = s+s1;
		}
		return s;
	}
	
}
