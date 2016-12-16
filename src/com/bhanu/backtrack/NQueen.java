package com.bhanu.backtrack;

public class NQueen {

	public static int size =8;
	public static int soln[][] = new int[size][size];
	
	public static boolean check( int x, int y){

		if(x >=size || y>= size ){
			return false;
		}
		
		boolean flag = false;
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size ;j++){
				if(soln[i][j] ==1){
					flag = isSafe(i,j ,x,y);
				}
			}
		}
		return flag;
	}
	
	public static boolean isSafe(int i, int j , int x , int y){
//		
//		if(x==i && y ==i){
//			return false;
//		}
		
		if(abs(i,x) == 0 || abs(y,j) ==0 || abs(y,j) == abs(i,x)){
			return false;
		}
		return true;
	}
	
	public static int abs(int a , int b){
		return a>b ? a-b : b-a;
	}
	
	
	public static boolean nQueens(int i, int j){

		if(i >= size ){
			return true;
		}
		
		for(int k=0; k < size ;k++){
			if(check(i,k)){
				soln[i][k] =1;
				if(nQueens(i+1,k))
					return true;
				soln[i][k] = 0;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
//		soln[0][1]=1;
		
		for(int i =0 ;i<size ;i++){
			soln[0][i]=1;
//			System.out.println(nQueens(1,0));
			if(nQueens(i,0)){
				break;
			}
			soln[0][i]=0;
		
		}
//		soln[0][1]=1;
//		soln[1][3]=1;
//		soln[2][0]=1;
//		soln[3][2]=1;
//		System.out.println(check(3,2));
		
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size ;j++){
				if(soln[i][j] ==1){
					System.out.println("( "+i+" , "+j+" )");
				}
			}
		}
		
	}
}
