package com.bhanu.graphs;

import java.util.*;

public class AdjacencyList {

	public static Map<Integer , List<Integer>> adjacencyList = new HashMap<Integer , List<Integer>>();
	
	public static void addEdge(int v1 , int v2){
		List<Integer> list ;

		if(adjacencyList.containsKey(v1)){
			list = (List<Integer>)adjacencyList.get(v1);
			if(!list.contains(v2))
				list.add(v2);
		}else{
			list =new LinkedList<Integer>();
			list.add(v2);
			adjacencyList.put(v1, list);
		}
	}
	public static void traverseGraph(){
		Iterator<Map.Entry<Integer , List<Integer>>> iterator = adjacencyList.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer , List<Integer>> entry =iterator.next();
			List<Integer> list = entry.getValue();
			System.out.print(entry.getKey() +" --> ");
			printEdges(list);
			System.out.println();
		}
	}
	
	public static void printEdges(List<Integer> list){
		for(Integer i : list){
			System.out.print(" "+i);
		}
	}
	
	public static void main(String[] args) {
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
		traverseGraph();
	}
}
