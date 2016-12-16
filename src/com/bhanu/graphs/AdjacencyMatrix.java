package com.bhanu.graphs;

public class AdjacencyMatrix {

	public static int [][] adjacencyMatrix = new int[5][5];
	public static int N =5;
	public static void main(String[] args) {
//		adjacencyMatrix[0][1]= 1;
//		adjacencyMatrix[0][4]= 1;
//		
//		adjacencyMatrix[1][0]= 1;
//		adjacencyMatrix[1][2]= 1;
//		adjacencyMatrix[1][3]= 1;
//		adjacencyMatrix[1][4]= 1;
//		
//		adjacencyMatrix[2][1]= 1;
//		adjacencyMatrix[2][3]= 1;
//		
//		adjacencyMatrix[3][1]= 1;
//		adjacencyMatrix[3][2]= 1;
//		adjacencyMatrix[3][4]= 1;
//		
//		adjacencyMatrix[4][0]= 1;
//		adjacencyMatrix[4][1]= 1;
//		adjacencyMatrix[4][3]= 1;
		
		addEdge(0,1);
		addEdge(0,4);
		
		addEdge(1,0);
		addEdge(1,2);
		addEdge(1,3);
		addEdge(1,4);
		
		addEdge(2,1);
		addEdge(2,3);
		
		addEdge(3,1);
		addEdge(3,2);
		addEdge(3,4);
		
		addEdge(4,0);
		addEdge(4,1);
		addEdge(4,3);
		printGraph();
	}
	
	public static void addEdge(int v1 , int v2){
		if(v1>= N || v2>= N){
			System.out.println("Could not add edge  !!! ");
			return ;
		}
		adjacencyMatrix[v1][v2]= 1;
	}
	
	public static void printGraph(){
		System.out.println("Printing Graph");
		for(int i=0;i<N ;i++){
			for(int j=0 ;j<N ;j++){
				System.out.print(" "+adjacencyMatrix[i][j]);
			}
			System.out.println();
		}
	}
}
