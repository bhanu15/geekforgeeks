package test;

import java.util.Stack;
public class Balancing {
	
	public static String input = "()";
	public static  int isValid(String input){
		char inputArr[] = input.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		for(char c : inputArr){
			if(stack.isEmpty()){
				stack.push(c);
				continue;
			}
			Character top = stack.peek();
			if(!top.equals(c)){
				stack.pop();
			}else{
				stack.push(c);
			}
		}
		if(stack.isEmpty()){
			System.out.println(" input" +input);
		}
		return stack.isEmpty()? input.length() : 0;
	}
	public static void main(String[] args) {
		String input = "(())(())(())(())))(())(())(())";
		System.out.println(maxLength( input , 0 , input.length()));
	}
	
	public static int maxLength( String input , int start , int end){
		if( start >= end)
		return 0;
		
		return  Math.max( isValid(input.substring(start , end)) ,Math.max(maxLength(input, start+1 , end ) ,maxLength( input ,start , end -1)));
	}
}
