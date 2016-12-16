package com.bhanu.backtrack;

public class Maze {

	public static int size =3 ;
	
	public static int maze[][] = new int[size][size];
	public static int solution[][] = new int[size][size];
	public static boolean isSafe(int i , int j){
		if(i >= size || j >= size){
			return false;
		}
		
		if(maze[i][j] == 1){
			return true;
		}

		return false;
	}
	
	public static boolean solveMaze(int i , int j){
		if(i==size-1 && j == size-1){
			solution[i][j] = 1;
			return true;
		}
		
		if(isSafe(i,j)){
			solution[i][j] = 1;
			if(solveMaze(i+1 , j) || solveMaze(i , j+1) ){
				return true;
			}
			solution[i][j] = 0;
		}
		return false;
	}
	
	public static void main(String[] args) {
		maze[0][0] =1;
		maze[0][1] =1;
		maze[1][1] =1;
		maze[1][2] =1;
		maze[2][2] =1;
		
		System.out.println(solveMaze(0,0));
		
		for(int i=0 ; i<size ;i++){
			for(int j=0;j<size ;j++){
				System.out.println("("+i+" , "+j+" )"+solution[i][j]);
			}
		}
	}
}
